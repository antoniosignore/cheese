package com.netnumeri.server.finance.indicator

import org.springframework.validation.Errors
import org.springframework.web.servlet.support.RequestContextUtils

class DtmcTagLib {
    static namespace = 'dtmc'

    def indicators = { attrs ->
        def indicators = attrs.indicators
        indicators.eachWithIndex { indicator, counter ->
            out << g.render(template: '/common/indicator', model: [indicator: indicator, indicatorCounter: counter])
        }
    }

    def stocks = { attrs ->
        def stockList = attrs.list
        stockList.eachWithIndex { stock, counter ->
            out << g.render(template: '/ssa/ssa', model: [stockInstance: stock, indicatorCounter: counter])
        }
    }

    def users = { attrs ->
        def indicators = attrs.users
        users.eachWithIndex { user, counter ->
            out << g.render(template: '/stock/users', model: [user: user, userCounter: counter])
        }
    }


    def extractErrors(attrs) {
        def model = attrs.model
        def checkList = []
        if (attrs.containsKey('bean')) {
            if (attrs.bean) {
                checkList << attrs.bean
            }
        } else if (attrs.containsKey('model')) {
            if (model) {
                checkList = model.findAll { it.value?.errors instanceof Errors }.collect { it.value }
            }
        } else {
            for (attributeName in request.attributeNames) {
                def ra = request[attributeName]
                if (ra) {
                    def mc = GroovySystem.metaClassRegistry.getMetaClass(ra.getClass())
                    if (ra instanceof Errors && !checkList.contains(ra)) {
                        checkList << ra
                    } else if (mc.hasProperty(ra, 'errors') && ra.errors instanceof Errors && !checkList.contains(ra.errors)) {
                        checkList << ra.errors
                    }
                }
            }
        }

        def resultErrorsList = []

        for (i in checkList) {
            def errors = null
            if (i instanceof Errors) {
                errors = i
            } else {
                def mc = GroovySystem.metaClassRegistry.getMetaClass(i.getClass())
                if (mc.hasProperty(i, 'errors')) {
                    errors = i.errors
                }
            }
            if (errors?.hasErrors()) {
                // if the 'field' attribute is not provided then we should output a body,
                // otherwise we should check for field-specific errors
                if (!attrs.field || errors.hasFieldErrors(attrs.field)) {
                    resultErrorsList << errors
                }
            }
        }

        resultErrorsList
    }

    Closure noErrors = { attrs, body ->
        def errorsList = extractErrors(attrs)
        if (!errorsList) {
            out << body()
        }
    }


    def paginate = {
        attrs ->
            def writer = out
            if (attrs.total == null) {
                throwTagError("Tag [paginate] is missing required attribute [total]")
            }

            def messageSource = grailsAttributes.messageSource
            def locale = RequestContextUtils.getLocale(request)

            def total = attrs.int('total') ?: 0
            def action = (attrs.action ? attrs.action : (params.action ? params.action : "list"))
            def offset = params.int('offset') ?: 0
            def max = params.int('max')
            def maxsteps = (attrs.int('maxsteps') ?: 10)

            if (!offset) offset = (attrs.int('offset') ?: 0)
            if (!max) max = (attrs.int('max') ?: 10)

            def linkParams = [:]
            if (attrs.params) linkParams.putAll(attrs.params)
            linkParams.offset = offset - max
            linkParams.max = max
            if (params.sort) linkParams.sort = params.sort
            if (params.order) linkParams.order = params.order
            if (params.targetDomain) linkParams.targetDomain = params.targetDomain

            def linkTagAttrs = [action: action]
            if (attrs.controller) linkTagAttrs.controller = attrs.controller
            if (attrs.id != null) linkTagAttrs.id = attrs.id
            if (attrs.fragment != null) linkTagAttrs.fragment = attrs.fragment
            linkTagAttrs.params = linkParams

            // determine paging variables
            def steps = maxsteps > 0
            int currentstep = (offset / max) + 1
            int firststep = 1
            int laststep = Math.round(Math.ceil(total / max))

            // display previous link when not on firststep
            def disabledPrev = (currentstep > firststep) ? "" : "disabled"
            def isDisabledPrev = (currentstep > firststep) ? false : true

            //		linkTagAttrs.class = 'prevLink'
            //		linkParams.offset = offset - max
            writer << "<div class=\"pagination pagination-centered\">"

            writer << "<ul>"
            writer << "<li class='prev ${disabledPrev}'>"
            if (isDisabledPrev) {
                writer << "<span>" + messageSource.getMessage('default.paginate.prev', null, 'Previous', locale) + "</span>"
            } else {
                writer << link(linkTagAttrs.clone()) {
                    (attrs.prev ?: messageSource.getMessage('paginate.prev', null, messageSource.getMessage('default.paginate.prev', null, 'Previous', locale), locale))
                }
            }
            writer << "</li>"

            // display steps when steps are enabled and laststep is not firststep
            if (steps && laststep > firststep) {
                linkTagAttrs.class = 'step'

                // determine begin and endstep paging variables
                int beginstep = currentstep - Math.round(maxsteps / 2) + (maxsteps % 2)
                int endstep = currentstep + Math.round(maxsteps / 2) - 1
                if (beginstep < firststep) {
                    beginstep = firststep
                    endstep = maxsteps
                }
                if (endstep > laststep) {
                    beginstep = laststep - maxsteps + 1
                    if (beginstep < firststep) {
                        beginstep = firststep
                    }
                    endstep = laststep
                }

                // display firststep link when beginstep is not firststep
                if (beginstep > firststep) {
                    linkParams.offset = 0
                    writer << "<li>"
                    writer << link(linkTagAttrs.clone()) { firststep.toString() }
                    writer << "</li>"
                    writer << '<li class="disabled"><a href="#">…</a></li>'
                }

                // display paginate steps
                (beginstep..endstep).each { i ->
                    if (currentstep == i) {
                        writer << "<li class='active'><a href='#'>" + i.toString() + "</a></li>"
                    } else {
                        linkParams.offset = (i - 1) * max
                        writer << "<li>"
                        writer << link(linkTagAttrs.clone()) { i.toString() }
                        writer << "</li>"
                    }
                }

                // display laststep link when endstep is not laststep
                if (endstep < laststep) {
                    linkParams.offset = (laststep - 1) * max
                    writer << '<li class="disabled"><a href="#">…</a></li>'
                    writer << "<li>"
                    writer << link(linkTagAttrs.clone()) { laststep.toString() }
                    writer << "</li>"
                }
            }

            // display next link when not on laststep
            def disabledNext = (currentstep < laststep) ? "" : "disabled"
            def isDisabledNext = (currentstep < laststep) ? false : true

            linkParams.offset = (currentstep) * max
            writer << "<li class='next ${disabledNext}'>"
            if (isDisabledNext) {
                writer << "<span>" + messageSource.getMessage('default.paginate.next', null, 'Next', locale) + "</span>"
            } else {
                writer << link(linkTagAttrs.clone()) {
                    (attrs.next ? attrs.next : messageSource.getMessage('paginate.next', null, messageSource.getMessage('default.paginate.next', null, 'Next', locale), locale))
                }
            }
            writer << "</li>"
            writer << "</ul>"
            writer << "</div>"

    }


}
