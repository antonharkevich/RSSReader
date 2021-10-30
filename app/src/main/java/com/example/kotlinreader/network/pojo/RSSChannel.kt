package com.example.kotlinreader.network.pojo

import com.tickaroo.tikxml.annotation.*

@Xml
class RSSChannel {
    @PropertyElement
    var link: String? = null

    @Element(name="item")
    var itemList: List<Item>? = null


    @PropertyElement
    var title: String? = null
    @PropertyElement
    var language: String? = null
    @PropertyElement
    var ttl: Int = 0
    @PropertyElement
    var pubDate: String? = null

    override fun toString(): String {
        return "Channel{" +
                "link=" + link +
                ", itemList=" + itemList +
                ", title='" + title + '\''.toString() +
                ", language='" + language + '\''.toString() +
                ", ttl=" + ttl +
                ", pubDate='" + pubDate + '\''.toString() +
                '}'.toString()
    }

    @Xml
    class ItemImage {
        @Attribute(name = "href")
        var link: String? = null
    }

    @Xml
    class Item {

        @PropertyElement
        var title: String? = null
        @PropertyElement
        var link: String? = null
        @PropertyElement
        var description: String? = null
        @PropertyElement
        var author: String? = null
        @PropertyElement
        var pubDate: String? = null
        @Element(name = "itunes:image")
        var imageLink: ItemImage? = null

        override fun toString(): String {
            return "Item{" +
                    "title='" + title + '\''.toString() +
                    ", link='" + link + '\''.toString() +
                    ", description='" + description + '\''.toString() +
                    ", author='" + author + '\''.toString() +
                    ", pubDate='" + pubDate + '\''.toString() +
                    '}'.toString()
        }
    }
}