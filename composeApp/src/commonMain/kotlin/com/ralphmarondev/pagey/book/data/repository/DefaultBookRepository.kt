package com.ralphmarondev.pagey.book.data.repository

import com.ralphmarondev.pagey.book.data.mappers.toBook
import com.ralphmarondev.pagey.book.data.network.RemoteBookDataSource
import com.ralphmarondev.pagey.book.domain.Book
import com.ralphmarondev.pagey.book.domain.BookRepository
import com.ralphmarondev.pagey.core.domain.DataError
import com.ralphmarondev.pagey.core.domain.Result
import com.ralphmarondev.pagey.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}