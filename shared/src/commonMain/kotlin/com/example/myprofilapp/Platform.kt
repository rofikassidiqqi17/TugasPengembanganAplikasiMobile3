package com.example.myprofilapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform