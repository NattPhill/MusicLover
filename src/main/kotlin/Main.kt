fun main(args: Array<String>) {
    val totalPrice = 15000          // сумма покупок
    val discount1 = 100            // от 1 001 до 10 000 рублей скидка составит 100 рублей
    val discount2 = 0.05           // от 10 001 рубля скидка составит 5% от суммы
    val regularСustomer = true     // постоянный клиент
    val discount3 = 0.01           // 1% скидки дополнительно для постоянных клиентов

    val result = if (totalPrice >= 1001 && totalPrice <= 10_000) {
        totalPrice - discount1
    } else if (totalPrice >= 10_001) {
        (totalPrice - (totalPrice * discount2)).toInt()
    } else totalPrice
    val additionalDiscount: Double = if (regularСustomer) result * discount3 else 0.0    // расчет доп скидки
    val toPay =  result - additionalDiscount

    println("Сумма к оплате $toPay")
}