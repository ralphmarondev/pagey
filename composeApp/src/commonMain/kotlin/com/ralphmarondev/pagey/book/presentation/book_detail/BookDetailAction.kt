package com.ralphmarondev.pagey.book.presentation.book_detail

import com.ralphmarondev.pagey.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavoriteClick : BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}