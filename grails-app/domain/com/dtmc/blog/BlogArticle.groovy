package com.dtmc.blog

import com.dtmc.club.Member
import org.grails.taggable.*

class BlogArticle implements Taggable {

    static searchable = true

    //properties
    String subject
    String body
    String teaser
    Date dateCreated
    Date lastUpdated
    ArticleStatus status = ArticleStatus.UNPUBLISHED

    //relations
    Member author
    static hasMany = [comments: BlogComment, links: BlogLink]

    static constraints = {
        subject(blank: false, nullable: false, size: 5..200, unique: false)
        body(blank: false, nullable: false, size: 5..10000)
        teaser(blank: true, nullable: true, size: 5..255)
        status(nullable: false)
        author(nullable: false)
    }

    String toString() {
        return "${subject} : ${body} (${dateCreated})"
    }
}

enum ArticleStatus {
    UNPUBLISHED,
    PUBLISHED,
    DISABLED
}



