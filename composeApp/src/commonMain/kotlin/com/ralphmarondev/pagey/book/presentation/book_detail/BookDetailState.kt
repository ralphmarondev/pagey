package com.ralphmarondev.pagey.book.presentation.book_detail

import com.ralphmarondev.pagey.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)