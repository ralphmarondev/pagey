package com.ralphmarondev.pagey.di

import com.ralphmarondev.pagey.book.data.network.KtorRemoteBookDataSource
import com.ralphmarondev.pagey.book.data.network.RemoteBookDataSource
import com.ralphmarondev.pagey.book.data.repository.DefaultBookRepository
import com.ralphmarondev.pagey.book.domain.BookRepository
import com.ralphmarondev.pagey.book.presentation.SelectedBookViewModel
import com.ralphmarondev.pagey.book.presentation.book_detail.BookDetailViewModel
import com.ralphmarondev.pagey.book.presentation.book_list.BookListViewModel
import com.ralphmarondev.pagey.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}