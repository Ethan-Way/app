package com.example.myapplication.data

import com.google.gson.annotations.SerializedName
import java.time.DayOfWeek
import java.time.LocalTime

data class DiscogsResponse(
    val pagination: Pagination,
    val results: List<Release>
)

data class Pagination(
    val page: Int,
    val pages: Int,
    @SerializedName("per_page") val perPage: Int,
    val items: Int,
    @SerializedName("urls") val urls: Map<String, String>
)

data class Release(
    val title: String,
    @SerializedName("country") val country: String?,
    val year: String?,
    val format: List<String>?,
    val label: List<String>?,
    val type: String?,
    val genre: List<String>?,
    val style: List<String>?,
    val id: Int,
    @SerializedName("barcode") val barcode: List<String>?,
    @SerializedName("user_data") val userData: UserData?,
    @SerializedName("master_id") val masterId: Int,
    @SerializedName("master_url") val masterUrl: String?,
    val uri: String?,
    @SerializedName("catno") val catalogNumber: String?,
    @SerializedName("thumb") val thumbUrl: String?,
    @SerializedName("cover_image") val coverImageUrl: String?,
    @SerializedName("resource_url") val resourceUrl: String?,
    val community: Community?,
    @SerializedName("format_quantity") val formatQuantity: Int?,
    val formats: List<Format>?
)

data class UserData(
    @SerializedName("in_wantlist") val inWantlist: Boolean,
    @SerializedName("in_collection") val inCollection: Boolean
)

data class Community(
    val want: Int?,
    val have: Int?
)

data class Format(
    val name: String?,
    val qty: String?,
    val text: String?,
    val descriptions: List<String>?
)

data class MasterDetailsResponse(
    @SerializedName("lowest_price") val lowestPrice: Double?,
    @SerializedName("num_for_sale") val numForSale: Int?,
    @SerializedName("main_release_url") val mainReleaseUrl: String?
)

data class RatingResponse(
    @SerializedName("release_id") val releaseId: Int,
    val rating: Rating
)

data class Rating(
    val count: Int,
    val average: Double
)

data class TimeOfWeek(
    val day: DayOfWeek,
    val open: LocalTime,
    val close: LocalTime
)

data class Period(
    val open: TimeOfWeek,
    val close: TimeOfWeek
)

data class OpeningHours(
    val periods: List<Period>
)