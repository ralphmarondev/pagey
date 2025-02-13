package com.ralphmarondev.pagey.book.data.network

import com.ralphmarondev.pagey.book.data.dto.SearchResponseDto
import com.ralphmarondev.pagey.core.data.safeCall
import com.ralphmarondev.pagey.core.domain.DataError
import com.ralphmarondev.pagey.core.domain.Result
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter

private const val BASE_URL = "https://openlibrary.org"

class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
) : RemoteBookDataSource {

    override suspend fun searchBooks(
        query: String,
        resultLimit: Int?
    ): Result<SearchResponseDto, DataError.Remote> {
        return safeCall {
            httpClient.get(
                urlString = "$BASE_URL/search.json"
            ) {
                parameter("q", query)
                parameter("limit", resultLimit)
                parameter("language", "eng")
                parameter(
                    "fields",
                    "key,title,language,cover_i,author_name,author_key,cover_edition_key,first_publish_key,ratings_average,ratings_count,number_of_pages_median,edition_count"
                )
            }
        }
    }
}