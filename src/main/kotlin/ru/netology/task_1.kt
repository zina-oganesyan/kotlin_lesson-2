package ru.netology

fun main() {

    val amount = 10010_00
    val minCommission = 35_00
    val percentCommission = 0.0075

    val commission =
        if (amount * percentCommission > minCommission) (amount * percentCommission).toInt()
        else minCommission

    val rubles = commission / 100
    val pennies = commission % 100

    println("Комиссия составила: $rubles руб.${if (pennies > 0) " $pennies коп." else ""}")

}