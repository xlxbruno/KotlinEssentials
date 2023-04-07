fun main(){
    // we use strings to store text
    // eg :
    var name = "Hanks"
    // accessing characters in strings
    println(name[0])
    // get length of string
    println(name.length)
    // change casing
    println(name.uppercase())
    println(name.lowercase())
    // comparing strings
    var name2 = "Hanks"
    println(name.compareTo(name2))
    // find string within string
    var hellotext  = "Please locate where the word locate is"
    println(hellotext.indexOf("locate"))
    // concertinate strings
    var greeting = "Hello"
    println(greeting + " " + name + "!")
    // interpolation or string templating
    var lastname = "Ian"
    println("My name is $name $lastname")


}