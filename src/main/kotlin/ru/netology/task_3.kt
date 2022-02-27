package ru.netology

fun main() {

    val currentCheck = 1010_00
    val previousCheck = 10_000_00
    val isMusicLover = true

    var discountCheck = currentCheck
    if (previousCheck in 1001_00..10_000_00) discountCheck = currentCheck - 100_00
    else if (previousCheck > 10_000_00) discountCheck = currentCheck - (currentCheck * 0.05).toInt()

    if (isMusicLover) discountCheck = (discountCheck - (discountCheck * 0.01)).toInt()

    val rubles = discountCheck / 100
    val pennies = discountCheck % 100

    println("Стоимость, со всеми скидками, составила: $rubles руб.${if (pennies > 0) " $pennies коп." else ""}")
}
