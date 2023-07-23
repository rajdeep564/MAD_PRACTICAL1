fun Myfun( num1 : Double, num2 : Double, opereator : String?): Double?{
    return when (opereator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> num1 / num2
        "*" -> num1 * num2
        else -> null
    }
}
fun main(){
    println("Enter 1st Number :")
    val num1 = readLine()?.toDoubleOrNull()

    println("Enter 1st Number :")
    val num2 = readLine()?.toDoubleOrNull()

    if(num1 != null && num2 != null){
        println("enter the opereator")
        val opereator = readLine()

        val result = Myfun(num1 , num2 , opereator)
        if(result != null){
            println("Result = $result")
        }
        else{
            println("Enter a valid Opereator")
        }
    }
    else{
        println("Enter a valid Number")
    }

}