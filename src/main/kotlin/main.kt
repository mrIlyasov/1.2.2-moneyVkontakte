fun main() {
    val min = 35_00
    val comission = 0.0075
    var amount = 10000_00
    var currentComisssion = amount * comission
    val result: Int = if (currentComisssion < min) (amount - min) else (amount - currentComisssion).toInt()
    val resultInRoubles= result/100
    println(resultInRoubles)
}
