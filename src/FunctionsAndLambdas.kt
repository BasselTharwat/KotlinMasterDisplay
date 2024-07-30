fun applyToStrings(strings: List<String>, func: (String) -> String): List<String>{
    val newStrings: List<String> = strings.map {
        func(it)
    }
    return newStrings
}

fun ourFunc(string: String) = string.uppercase()




fun main(args: Array<String>) {
    //higher order functions
    val strings = listOf("h","a","ppp","y","is our motto")
    println( applyToStrings(strings, ::ourFunc) ) //this will be the output [H, A, PPP, Y, IS OUR MOTTO]


    //lambda functions
    val myList : List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
    val filteredList = { myList: List<Int> -> myList.filter { it % 2 == 0 } }
    println( filteredList(myList) )

}