

fun mapStringLengths(strings: List<String>): Map<String, Int> = strings.associateWith { it.length }

fun main(args: Array<String>) {

    //manipulating collections
    val list : List<String> = listOf("hi","hello","goodbye")
    var set : Set<String> = setOf("hi","hello","goodbye")
    var map : Map<Int, String> = mapOf(Pair(1,"Bassel") ,Pair(2,"Samir"), Pair(3, "Tharwat") )


    val newList = list.filter { it.length > 3}
    val newSet = set.map { it + " Bassel" }
    val sum = map.map { it.key } //this will get the key from each pair
        .reduce { acc, it -> acc + it  } //this will apply the function to all its, and it here is it.key

    println(newList) //[hello, goodbye]
    println(newSet) //[hi Bassel, hello Bassel, goodbye Bassel]
    println(sum) //6





    val newMap = mapStringLengths(listOf("hi","hello","goodbye"))
    println(newMap) //{hi=2, hello=5, goodbye=7}







}