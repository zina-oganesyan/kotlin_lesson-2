package ru.netology

fun main() {
    val likes = 111

    var word = "людям"
    if (!likes.toString().endsWith("11") && likes.toString().endsWith("1")) word = "человеку"

    println("Понравилось $likes $word")
}