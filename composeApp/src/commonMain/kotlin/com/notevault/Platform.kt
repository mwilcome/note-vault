package com.notevault

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform