package com.binarybrains.connectwell

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform