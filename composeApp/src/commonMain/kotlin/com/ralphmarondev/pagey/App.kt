package com.ralphmarondev.pagey

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ralphmarondev.pagey.book.data.network.KtorRemoteBookDataSource
import com.ralphmarondev.pagey.book.data.repository.DefaultBookRepository
import com.ralphmarondev.pagey.book.presentation.book_list.BookListScreenRoot
import com.ralphmarondev.pagey.book.presentation.book_list.BookListViewModel
import com.ralphmarondev.pagey.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine

@Composable
fun App(engine: HttpClientEngine) {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = remember {
                BookListViewModel(
                    bookRepository = DefaultBookRepository(
                        remoteBookDataSource = KtorRemoteBookDataSource(
                            httpClient = HttpClientFactory.create(engine)
                        )
                    )
                )
            },
            onBookClick = {
                // Handle book click
            }
        )
    }
}