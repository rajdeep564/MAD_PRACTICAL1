open class Student(var eno : Long, var sname : String){
    init {
        println("this line is from init block")
    }
    constructor() : this(21012011167,"Rajdeep"){
        println("the name of student is $sname and enrollment no is $eno")

    }
}

class Person (eno: Long,sname: String) : Student(eno, sname){
    fun DisplayDetails(){
        println("Person Details :")
        println("Enrollment no : $eno")
        println("Student Name : $sname")
    }
    fun Introduce(){
        println("Hello my name is $sname and my enrollment no is $eno")
    }
}
fun main(){
    var S1 = Student()
    println(S1.eno)
    println(S1.sname)

    var P1 = Person(21012011164, "Nisarg")
    P1.DisplayDetails()
    P1.Introduce()
}