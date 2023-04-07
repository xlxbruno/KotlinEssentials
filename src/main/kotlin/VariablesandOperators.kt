// variable : container for storing data
// use val or var
// var are changeable
// val are not changeable

fun main(){
    var name = "Hanks"
    println(name)
    name = "Joseph"
    println(name)
    val name1 = "Bruno"
    println(name1)
// Date types
    var mynum = 5 // int
    var mydouble = 5.99 // double or float
    val myletter = 'o' // char
    val myboolean = true or false // boolean
    // strings have "", char have ''


  //Integer types
    // -Byte ; -128 to 127
    // - Short ; -32,768 to 32,767
    // -Int ; -2,147,483,648 to 2,147,483,647
    // -Long ; 	-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807

    /*Type conversions*/
    // There are inbuilt methods to do so
    // Include:
    // -toLong, toInt, toByte,etc
    //Example
    val price = "5000"
    val discount = 50
    val bp = price.toLong() - discount
    println(bp)

    var xy = 5
    println(xy)
    xy += 5
    println(xy)
    var xz = 6
    println(xz)
    xz /= 5
    println(xz)


    var age = 10
    var entryage = "18"

    println(age == entryage.toInt())
    println(age != entryage.toInt())
    println(!(age >= entryage.toInt()))




}
// Date types in kotlin
// all above + arrays;similar to lists
// Number are 2 groups:
// -Integer type(byte, short, int, long): store - or + without decimal
// -Floating point type:rep with fractional parts


/*Arithmetic operators*/
// + ;Addition
// - ;Subtraction
// / ;Division
// * ;Multiplication
// % ;Modulus,returns remainder
// ++ ;Increment,increases value by 1 eg: ++x
// -- Decrement,decreases value by 1 eg: --x

/*Assignment operators*/
// Symbol   use    same as
//  =     x = 5     x = 5
//  +=   x += 5    x = x + 5
// -=    x -=5      x =  x-5 etc

/*Logical operators*/
//   Symbol           Name       Desc
//    &&             and       returns true if both are true
//    ||              or       returns true if either is true
//     !             not        reverses result


/*Comparison operators*/
//  Symbol         Name                      Example
//    >           greater than                x > y
//    <           less than                   x < y
//    >=          greater than or equal to    x >= y
//    <=          less than or equal to       x <= y
//    ==          equals to                   x == y

