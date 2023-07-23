fun main(){
    print("Enter a number :")
    val input = readLine()
    val number = input?.toIntOrNull()
    if (number != null){
        println( if(number % 2 == 0)"the number is even." else "the number is odd.")
    }
    else{
        println("Invalid Input")
    }
}

