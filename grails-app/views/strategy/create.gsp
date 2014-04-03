<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart">
    <g:set var="entityName" value="${message(code: 'strategy.label', default: 'Strategy')}"/>
    <title><g:message code="default.create.label" args="[entityName]"/></title>

</head>


<body>

<div id="create-strategy" class="content scaffold-create" role="main">
    <h1><g:message code="default.create.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:hasErrors bean="${strategyInstance}">
        <ul class="errors" role="alert">
            <g:eachError bean="${strategyInstance}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
                        error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>
    <g:form url="[resource: strategyInstance, action: 'save']">
        <fieldset class="form">
            <g:render template="form"/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="save btn btn-primary"
                            value="${message(code: 'default.button.create.label', default: 'Create')}"/>
        </fieldset>
    </g:form>
</div>

<div class="bootstrap-container">

    <div class="row">
        <div class="span4">
            <ol id="test" class="simple_with_animation vertical">
                <li id='pippo' class="well">Item 1</li>
                <li id='pluto' class="well">Item 2</li>
            </ol>
        </div>

        <div class="span4">
            <ol class="simple_with_animation vertical">
                <g:each in="${userIndicatorsInstanceList}" status="i" var="userIndicatorsInstance">
                    <li id='${fieldValue(bean: userIndicatorsInstance, field: "id")}'>${fieldValue(bean: userIndicatorsInstance, field: "name")}</li>
                </g:each>
            </ol>
        </div>
    </div>
</div>

<r:external uri="/js/jquery-sortable.js"/>

<script>
    var adjustment

    $("ol.simple_with_animation").sortable({
        group: 'simple_with_animation',
        pullPlaceholder: false,

        serialize: function (parent, children, isContainer) {
            return isContainer ? children.join() : parent.text()
        },

        // animation on drop
        onDrop: function (item, targetContainer, _super) {

            alert ('on drop start')

            var dataToSend = $("ol#test").sortable("serialize").get();

//            alert(dataToSend)

            $.ajax({
                url: "action1",
                type: "post",
                data:  {code: JSON.stringify(dataToSend)},
                cache: false,
                success: function () {
//                    alert('success')
                    var clonedItem = $('<li/>').css({height: 0})
                    item.before(clonedItem)
                    clonedItem.animate({'height': item.height()})

                    item.animate(clonedItem.position(), function () {
                        clonedItem.detach()
                        _super(item)
                    })
                },
                error: function(){
                    alert('error')
                }
            });
        },

        // set item relative to cursor position
        onDragStart: function ($item, container, _super) {

            var offset = $item.offset(),
                    pointer = container.rootGroup.pointer

            adjustment = {
                left: pointer.left - offset.left,
                top: pointer.top - offset.top
            }

            _super($item, container)
        },
        onDrag: function ($item, position) {
            $item.css({
                left: position.left - adjustment.left,
                top: position.top - adjustment.top
            })
        }
    })
</script>

</body>
</html>
