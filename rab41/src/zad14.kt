import Car.Car

fun main(){
    try {
        val ott: Car = Car(
            "Lada",
            410,
            610.900
        )
        //ott.otv()
        //ott.input()
        val ott2: Toyotacar = Toyotacar("Toyota",450, 600000.0,"Да")
        ott2.Getinfo()
        ott2.vvod()



    }catch (e:Exception){
        println("Неверный ввод")}
}