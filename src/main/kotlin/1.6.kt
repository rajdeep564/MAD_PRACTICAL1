fun main(){
    println("Enter The Month (1-12) :")
    val input = readLine()
    val month = input?.toIntOrNull()

    if(month != null && month in  1..12){
        val monthname = when(month){
            1 -> "Jan"
            2 -> "Feb"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "Aug"
            9 -> "Sept"
            10 -> "Oct"
            11 -> "Nov"
            12 -> "Dec"
            else -> "Invalid Number"
        }
        println("The month is $monthname")
    }
    else{
        println("Invalid input please enter a valid number (1-12)")
    }
}