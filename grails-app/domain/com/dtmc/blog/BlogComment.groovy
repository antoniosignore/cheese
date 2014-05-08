package com.dtmc.blog

class BlogComment {

    String author
    String message
    Date dateCreated
    String ip
    String captcha

    static belongsTo = [article: BlogArticle]
    static transients = ["captcha"]

    static constraints = {
        author(blank: false, nullable: false, size: 1..40)
        ip(nullable: true)
//        message(validator: {
//                if (it.indexOf('<') > -1) {
//                    return ['invalid.bountyhunter']
//                }
//            }, blank: false, nullable: false, size: 5..1000)
        message(blank: false, nullable: false, size: 5..1000)
    }

    String toString() {
        return "#${id} - ${author} : ${message?.size() < 21 ? message : message[0..19]}"
    }
}
