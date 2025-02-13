package com.ralphmarondev.pagey

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ralphmarondev.pagey.book.presentation.book_list.BookListScreenRoot
import com.ralphmarondev.pagey.book.presentation.book_list.BookListViewModel

@Composable
fun App() {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = remember { BookListViewModel() },
            onBookClick = {
                // Handle book click
            }
        )
    }
}