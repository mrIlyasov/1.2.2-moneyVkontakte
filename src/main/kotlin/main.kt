
    fun main(){
        val min = 35_00
        val comission = 0.075
        var amount = 100_00
        var currentComisssion = amount * comission
        val result = if (currentComisssion< min) amount - min else amount- currentComisssion
    println(result)
    }
