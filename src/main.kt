fun main() {
    var banker=Banker("Mary",22)
    var doctor=Doctor("Mercy",25)

    var farmer=Farmer("Njeri",35)
    banker.eat()
    banker.sleep()
    banker.talk("Hello,Can you kindly assist me with that Cup")
    println(banker.CountMoney(arrayOf(13,14,15,16)))
    doctor.eat()
    doctor.sleep()
    doctor.talk("We need more needles ")
    doctor.treatPatient("Happiness","Malaria")
    farmer.eat()
    println(doctor is Doctor)
    println(doctor is Person)
    println(doctor is Any)
   // banker.eat()
    farmer.eat()
    //doctor.eat()
    doctor.introduction()
    farmer.introduction()
    banker.introduction()



}
open class Person(var name:String,var age:Int){
                  fun talk(words:String){
        println(words)
    }
    open fun eat(){
        println("yum")
    }
    fun sleep() {
        println("ZZZzzzzzzzz")
    }
    open fun introduction(){
        println("Hi my name is $name")
    }
}
class Banker( name:String, Age:Int):Person(name,Age){
    fun CountMoney(notes:Array<Int>):Int{
        var sum= notes.sum()
        return sum
    }
    
}
class Doctor(name:String,age:Int):Person(name,age) {
    fun treatPatient(patient: String, disease: String) {
        println("Treating $patient for $disease")


    }

    override fun introduction() {
        //super.introduction()
        println("Hi my name is Dr $name ")
    }
}
class Farmer(name:String, age:Int):Person(name,age){
    fun cultivate(){
        println("Dig Dig Dig")
    }

    override fun eat() {
        super.eat()
        println("I am eating all the ice cream in the fridge")
    }
}