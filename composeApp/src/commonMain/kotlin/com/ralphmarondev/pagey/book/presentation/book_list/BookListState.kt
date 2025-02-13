package com.ralphmarondev.pagey.book.presentation.book_list

import com.ralphmarondev.pagey.book.domain.Book
import com.ralphmarondev.pagey.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)