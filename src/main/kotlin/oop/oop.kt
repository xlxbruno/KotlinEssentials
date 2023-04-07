package oop
class Cars {
    var brand = ""
    var model = ""
    var yom = ""
}
class car2(var brand :String,var model: String, var yom: String,var sound: String){
    fun drive(){
        print(brand + " makes the sound, "+ sound)
    }
    fun speed(maxspeed:Int){
        println(brand + " has a max speed of " + maxspeed)
    }}
fun main(){
    val carone = Cars()
    val cartwo = Cars()

    carone.brand = "Toyota"
    cartwo.brand = "Nissan"

    println(carone.brand)
    println(cartwo.brand)

    val car_three = car2("volvo", "v2","2000","vroom")
    val car_four = car2("toyota", "corolla","2004", "wooosh")
    println(car_three.drive())
    println(car_four.speed(120))
}