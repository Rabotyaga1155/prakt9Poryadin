import Car.*
class Toyotacar(var ebrand : String,var epower: Int,var eprice: Double, var garant : String):Car(ebrand,epower,eprice) {

    fun Getinfo() {

        println("Машина TOYOTA : ")
    }
    fun chgarant(){
        if (eprice>=500000){
            println("Гарантия есть")
        }
        else{
            println("Гарантии нет")
        }
    }
    fun vvod(){

        println("Введите марку")
        ebrand = readLine()!!.toString()
        println("Введите мощность")
        epower = readLine()!!.toInt()
        println("Введите цену")
        eprice = readLine()!!.toDouble()
        chgarant()

    }
}
