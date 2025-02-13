package com.ralphmarondev.pagey.book.data.network

import com.ralphmarondev.pagey.book.data.dto.SearchResponseDto
import com.ralphmarondev.pagey.core.domain.DataError
import com.ralphmarondev.pagey.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>
}