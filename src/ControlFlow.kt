fun categorizeMyNumber (num: Int) : String = if(num > 0) "positive" else {if(num < 0) "negative" else "zero"}

fun fibFirstTen () {
    var lastNumber = 0
    println("In iteration 0 , fibonacci's number = $lastNumber")
    var beforeTheLastNumber = 1
    for (i in 1..9){
        var temp = lastNumber + beforeTheLastNumber
        println("In iteration $i , fibonacci's number = ${temp}")
        beforeTheLastNumber = lastNumber
        lastNumber = temp
    }
}

fun main(args: Array<String>) {

    //categorizing a number
    println("please enter a number")
    var num = readLine()?:""
    while (num.toIntOrNull() != null){ //if the user entered any input other than an int, the loop breaks
        println( categorizeMyNumber(num.toInt()) )
        num = readLine()?:""
    }

    //print out the first 10 numbers in fibonacci sequence
    fibFirstTen()




}