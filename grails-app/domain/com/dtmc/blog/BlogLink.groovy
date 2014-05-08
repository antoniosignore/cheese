package com.dtmc.blog

class BlogLink {

    String label
    String url

    static belongsTo = [article: BlogArticle]

    static constraints = {
        label(blank: false, nullable: false, size: 1..128)
        url(blank: false, nullable: false, size: 1..1000)
        article(blank:false, nullable: false)
    }
    
    String toString() {
        return "#${label}: ${url} : ${article.subject}}"
    }




}
