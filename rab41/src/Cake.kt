package Cake
open class Cake(var dough: String, var cream: String, var weight: Double, var kkal: Int, var price: Double) {

    open fun otv(){
        println("Тесто - $dough \n Крем - $cream \n Вес - $weight \n Калорийность - $kkal \n Цена - $price")
    }
    open fun input(){
        println("Введите тесто")
        dough = readLine().toString()
        println("Введите Крем")
        cream = readLine().toString()
        println("Введите Вес")
        weight = readLine()!!.toDouble()
        println("Введите Калорийность")
        kkal = readLine()!!.toInt()
        println("Введите цена")
        price = readLine()!!.toDouble()
        println("Тесто - $dough \n Крем - $cream \n Вес - $weight \n Калорийность - $kkal \n Цена - $price")

    }
}
