package oop

class Car(var make:String, var model:String, var YOM:Int) {
    fun getInfo(): String {
        return "$make $model $YOM"
    }

    inner class Engine() {
        var horsepower : Int = 0
        var cylinders : Int = 0

        fun geEngineinfo():String{
            return "$make $model has  $horsepower horsepower and $cylinders cylinders"
        }

    }
}

fun main(){
    val car1 = Car("Toyota", "Corolla",2000)
    println(car1.Engine())
    val engine = car1.Engine()
    println(engine.geEngineinfo())

}