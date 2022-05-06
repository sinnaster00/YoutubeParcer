package com.joma.youtubeparcer.domain.model.playlist

import com.google.gson.annotations.SerializedName

data class PlayList(
    val kind: String? = null,
    @SerializedName("etag")
    val tag: String? = null,
    val nextPageToken: String? = null,
    @SerializedName("pageInfo")
    val pageInfo: PageInfo? = null,
    @SerializedName("items")
    val items: List<ItemPlayer>? = null
)

data class PageInfo(
    val totalResults: Int? = null,
    val resultsPerPage: Int? = null
)

data class ItemPlayer(
    val kind: String? = null,
    @SerializedName("etag")
    val tag: String? = null,
    val id: String? = null,
    val snippet: Snippet? = null,
    val contentDetails: ContentDetails? = null
)

data class ContentDetails(
    val itemCount: Int? = null
)

data class Snippet(
    @SerializedName("publishedAt")
    val publish: String? = null,
    val channelId: String? = null,
    val title: String? = null,
    val description: String? = null,
    @SerializedName("thumbnails")
    val thumb: Thumb? = null,
    val channelTitle: String? = null,
)

data class Thumb(
    @SerializedName("default")
    val default: DefaultThumb? = null,
    val medium: Medium? = null,
)


data class DefaultThumb(
    val url: String? = null,
    val width: Int? = null,
    val height: Int? = null
)

data class Medium(
    val url: String? = null,
    val width: Int? = null,
    val height: Int? = null
)