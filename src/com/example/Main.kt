package com.example

fun main(args: Array<String>) {
    val month = 2
    val year = 2020
    val numDays = 29
    var dayAtMonth = 0

    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> dayAtMonth = 31
        4, 6, 9, 11 -> dayAtMonth = 30
        2 -> dayAtMonth = 29
    }

    when {
        month < 1 || month > 12 || numDays < 0 || (year % 4 != 0 && numDays > 28) || numDays > dayAtMonth -> println("Значение недопустимо")
        else -> println("Успешно")
    }
}


