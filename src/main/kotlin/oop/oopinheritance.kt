package oop

open class Parent(){
    val x = 5
    open fun custom(){
        println("here from parent")
    }
}
class Child(var name:String): Parent(){
    fun childFunction(){
        println(x)
    }

    override fun custom(){
        println("here from child")
    }
}

fun main(){
    var myobject = Child("hanks")
    println(myobject.childFunction())

}