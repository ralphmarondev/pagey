package com.ralphmarondev.pagey.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.ralphmarondev.pagey.book.presentation.book_list.BookListScreenRoot
import com.ralphmarondev.pagey.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<BookListViewModel>()
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = Route.BookGraph
        ) {
            navigation<Route.BookGraph>(
                startDestination = Route.BookList
            ) {
                composable<Route.BookList> {
                    BookListScreenRoot(
                        viewModel = viewModel,
                        onBookClick = { book ->
                            navController.navigate(Route.BookDetail(book.id)) {
                                launchSingleTop = true
                            }
                        }
                    )
                }
                composable<Route.BookDetail> { entry ->
                    val args = entry.toRoute<Route.BookDetail>()

                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Id: ${args.id}"
                        )
                    }
                }
            }
        }
    }
}