class Car(
        val type: String,
        val model: String,
        val price: Double,
        val owner: String,
        var milesDrive: Int
) {
    private val originalPrice = price
    private var currentPrice = price

    fun getCarInformation(): String {
        return "Type: $type, Model: $model, Price: $price, Owner: $owner, Miles Drive: $milesDrive"
    }

    fun getOriginalCarPrice(): Double {
        return originalPrice
    }

    fun getCurrentCarPrice(): Double {
        return currentPrice
    }

    fun displayCarInfo() {
        println("Car Information:")
        println(getCarInformation())
    }

    fun getCarPrice(): Double {
        val depreciationRate = 0.1
        currentPrice = originalPrice - (depreciationRate * milesDrive)
        return currentPrice
    }
}

fun main() {
    val car = Car("Sedan", "Toyota Camry", 25000.0, "John Doe", 20000)

    println("Car Type: ${car.type}")
    println("Car Model: ${car.model}")
    println("Car Price: ${car.price}")
    println("Car Owner: ${car.owner}")
    println("Miles Drive: ${car.milesDrive}")

    car.displayCarInfo()

    println("Original Car Price: ${car.getOriginalCarPrice()}")
    println("Current Car Price: ${car.getCarPrice()}")
}
