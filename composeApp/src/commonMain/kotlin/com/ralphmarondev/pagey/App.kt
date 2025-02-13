package com.ralphmarondev.pagey

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.ralphmarondev.pagey.book.presentation.book_list.BookListScreenRoot
import com.ralphmarondev.pagey.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()

    MaterialTheme {
        BookListScreenRoot(
            viewModel = viewModel,
            onBookClick = {
                // Handle book click
            }
        )
    }
}