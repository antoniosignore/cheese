package com.dtmc.club

class ImageNode implements Serializable {

    byte[] photo
    byte[] photoThumbnail

    Integer imageWidth
    Integer imageHeight
    String imageMimeType

    Date dateCreated
    Date lastUpdated

    String tagstring

    String filename
    static transients = ["filename"]

    static belongsTo = [member: Member]

    static mapping = {
        id generator: 'sequence', params: [sequence: 'seq_images_id']
        photo sqlType: 'blob'
        photoThumbnail sqlType: 'blob'
    }

    static constraints = {

        photo nullable: false
        imageWidth nullable: false
        imageHeight nullable: false
        imageMimeType blank: false, nullable: false
        tagstring nullable: true; blank: false

    }

    @Override
    public String toString() {
        return "ImageNode{" +
                "\nid=" + id +
                "\n, imageWidth=" + imageWidth +
                "\n, imageHeight=" + imageHeight +
                "\n, imageMimeType='" + imageMimeType + '\'' +
                "\n, dateCreated=" + dateCreated +
                "\n, lastUpdated=" + lastUpdated +
                "\n, tagstring='" + tagstring + '\'' +
                "\n, filename='" + filename + '\'' +
                "\n, version=" + version +
                '}';
    }
}

