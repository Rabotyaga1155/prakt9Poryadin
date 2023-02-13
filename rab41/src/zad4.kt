import Cake.Cake

fun main(){
    try {
        val ott: Cake = Cake(
            "Дрожжевое",
            "Сливочный",
            5.0,
            3100,
            5100.0
        )
       // ott.otv()
       // ott.input()

        val ott1: Napoleoncake = Napoleoncake(
            4100.0,
            6000,
            3641.4,
            "Сливочный",
            "Слоеное",
            4,
            "Пшеничная",

        )
        ott1.Getinfo()
        ott1.vvod()

    }catch (e:Exception){
        println("Неверный ввод")}
}