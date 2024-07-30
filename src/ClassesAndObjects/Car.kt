package ClassesAndObjects

class Car(make: String, model: String, doors: Int) : Vehicle(make, model){
    var doors = doors

    override fun displayInfo(){
        println("This car is a $make $model car. It has $doors doors.")
    }

}
fun main(args: Array<String>){
    val newCar = Car("Mercedes", "GLC300", 5)
    newCar.displayInfo()
}