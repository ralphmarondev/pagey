package com.ralphmarondev.pagey.book.domain

import com.ralphmarondev.pagey.core.domain.DataError
import com.ralphmarondev.pagey.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}