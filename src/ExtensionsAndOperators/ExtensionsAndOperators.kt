package ExtensionsAndOperators
fun String.countVowels() = this.filter { it.toChar() == 'e' || it.toChar() == 'a'
        || it.toChar() == 'i' || it.toChar() == 'o' || it.toChar() == 'u'}.length


fun main(args: Array<String>) {
    println("hello".countVowels()) //2
    println("cry".countVowels()) //0
}