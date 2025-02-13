package com.ralphmarondev.pagey

import androidx.compose.ui.window.ComposeUIViewController
import com.ralphmarondev.pagey.app.App
import com.ralphmarondev.pagey.di.initKoin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){
    App()
}