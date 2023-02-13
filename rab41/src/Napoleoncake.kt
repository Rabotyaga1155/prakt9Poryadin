import Cake.*

class Napoleoncake constructor(var empprice: Double,var empkkal:Int,var empweight: Double,var empcream:String,var empdough: String, var eggs :Int,var flour : String):Cake(empdough,empcream,empweight,empkkal,empprice) {
//    constructor(_empprice: Double,_flour: String): this(_empprice){
//    flour = _flour
//    }
fun priceandkkal(){
    empprice = empweight*0.5
    empkkal = (empweight*0.25).toInt()
}
    fun Getinfo(){

    println("Рецепт торта Наполеон:")
}
    fun vvod(){


        println("Введите вес")
        empweight = readLine()!!.toDouble()
        println("Введите крем")
        empcream = readLine()!!.toString()
        println("Введите тесто")
        empdough = readLine()!!.toString()
        println("Введите количество яиц")
        eggs = readLine()!!.toInt()
        println("Введите муку")
        flour = readLine()!!.toString()
        priceandkkal()
        println("Калорийность - $empkkal\nВес - $empweight\nКрем - $empcream\nМука - $empdough\nКоличество яиц - $eggs\nМука - $flour\nЦена - $empprice")
    }

}