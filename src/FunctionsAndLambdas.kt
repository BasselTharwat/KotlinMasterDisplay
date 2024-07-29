fun applyToStrings(strings: List<String>, func: (String) -> String): List<String>{

    val newStrings: List<String> = strings.map {
        func(it)
    }
    return newStrings


}
fun ourFunc(string: String) = string.uppercase()

fun main(args: Array<String>) {
    val strings = listOf("h","a","ppp","y","is our motto")
    println( applyToStrings(strings, ::ourFunc) ) //this will be the output [H, A, PPP, Y, IS OUR MOTTO]


}