package com.scesi.marvelapp.model

class Comic {
    var id: Long
    var digitalId: Int
    var title: String
    var issueNumber: Int
    var variantDescription: String
    var description: String
    var modified: String
    var isbn: String
    var upc: String
    var diamondCode: String
    var ean: String
    var issn: String
    var format: String
    var pageCount: Int
    var textObjects: ArrayList<Object>
    var resourceURI: String
    var urls: ArrayList<Url>
    var series: Serie
    var variants: ArrayList<Variant>
    var collections: ArrayList<Object>
    var collectedIssues: ArrayList<Object>
    var dates: ArrayList<DateDetail>
    var prices: ArrayList<Price>
    var thumbnail: Thumbnail
    var images: ArrayList<Object>
    var creators: Creator
    var characters: Characters
    var variants:String
    var stories: Story
    var events: Events

}
