// block of code whick runs when called or invoked
fun main(){
    myGreeting()
    println( mysum(10, 20))
    println(shorthand(20, 50))
}
fun myGreeting(){
    println("Hello there")
}
fun mysum(a:Int, b:Int): Int{
    var result = a + b
    return result
}
fun shorthand(x:Int, y:Int) = x + y

