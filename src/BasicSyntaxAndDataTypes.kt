fun dataTypesDemo(){
    var myInt : Int = 5
    var myDouble : Double = 5.0
    var myString : String = "ITWorx"
    var myBoolean : Boolean = true

    println("Initially, myInt = $myInt ")
    println("Initially, myDouble = $myDouble ")
    println("Initially, myString = $myString ")
    println("Initially, myBoolean = $myBoolean ")

    myInt = 20
    myDouble = 20.45
    myString = "not ITWorx"
    myBoolean = false

    println("Afterwards, myInt = $myInt ")
    println("Afterwards, myDouble = $myDouble ")
    println("Afterwards, myString = $myString ")
    println("Afterwards, myBoolean = $myBoolean ")
}

fun sumOfEvenNumbers(numbers: List<Int>): Int{
    var sum = 0
    numbers.forEach {
        if(it % 2 == 0)
            sum += it
    }
    return sum
}

fun main(args: Array<String>) {
    //demonstrate data types
    dataTypesDemo()

    //print the sum of even numbers in a list
    val numbers : List<Int> = listOf(1,2,3,4,5,6)
    val sum = sumOfEvenNumbers(numbers)
    println("Sum of even numbers = $sum")



}