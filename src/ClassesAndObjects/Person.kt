package ClassesAndObjects

class Person(name: String, age: Int) {
    var name = name
    var age = age

    fun displayInfo(){
        println("This person's name is $name and they are $age years old.")
    }

}

fun main(args: Array<String>){
    var person : Person = Person("Bassel", 23)
    var newPerson : Person = Person("Sdoudy", 19)
    person.displayInfo()
    newPerson.displayInfo()

}
