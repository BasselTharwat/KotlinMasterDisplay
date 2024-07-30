package ExtensionsAndOperators

class ComplexNumber (real: Int, imaginary: Int){
    val real = real
    val imaginary = imaginary

    operator fun plus(other : ComplexNumber) : ComplexNumber{
        return ComplexNumber(this.real + other.real , this.imaginary + other.imaginary)
    }

    fun display() = println( "$real , $imaginary i" )
}

fun main(args: Array<String>) {
    val complexNumber1 = ComplexNumber(1,2)
    val complexNumber2 = ComplexNumber(3,4)

    val result : ComplexNumber = complexNumber1 + complexNumber2
    result.display()

}