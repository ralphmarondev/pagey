package com.ralphmarondev.pagey

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform