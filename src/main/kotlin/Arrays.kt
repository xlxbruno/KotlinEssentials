// store multiple values in single variable
fun main(){
    var cars = arrayOf(" BMW", "TOYOTA", "MERCEDES")
    // accessing items
    println(cars[0])
    //changing content
    cars[1] = "JEEP"
    println(cars[1])
    // array length or size
    println(cars.size)
    // to search for item
    if ("VOLVO" in cars){
        println("Exists")
    }
    else{
        println("Does not exist")
    }
    // to loop
    println("...............................")
    for (x in cars){
        println(x)
        if (x ==  "JEEP"){
            println("I have reached Jeep")
        }
    }
}