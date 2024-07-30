package ClassesAndObjects

class Motorcycle (make: String, model: String, topSpeed: Int) : Vehicle(make, model){
    var topSpeed = topSpeed

    override fun displayInfo(){
        println("This motorcycle is a $make $model motorcycle. It reaches $topSpeed km/h speed.")
    }
}

fun main(args: Array<String>){
    val newMotorcycle = Motorcycle("Harley", "C230", 350)
    newMotorcycle.displayInfo()
}