//safe calls and elvis operators
fun nullableStringLength(input: String?): Int = (input?.length)?:0

fun main(args: Array<String>) {
    println(nullableStringLength("string")) //6
    println(nullableStringLength(null)) //0
    println(nullableStringLength("")) //0

    println("please enter your name")
    val name : String = readln()?:"default name" //elvis operator
    println( "Hello, ${name.uppercase()}")

}