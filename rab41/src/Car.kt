package Car
open class Car(var brand: String, var power: Int, var price: Double) {
    open fun otv(){
        println("Марка автомобиля - $brand \n Мощность автомобиля - $power \n Стоимость автомобиля - $price")
    }
    open fun input(){
        println("Введите марку автомобиля")
        brand = readLine()!!.toString()
        println("Введите мощность автомобиля")
        power = readLine()!!.toInt()
        println("Введите стоимость автомобиля")
        price = readLine()!!.toDouble()

    }
}