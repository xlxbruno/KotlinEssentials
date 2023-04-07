fun main(){
    // we can use conditionals from maths eg less than greater than etc
    // also we have if, else, else if and when
    // -if : to execute code when statement is true
    // -else :to execute code when statement is false
    // -else if : to execute other code when first is false
    // -when : to specify alternative codes to be executed

    var age = 11
    var entryage = 10
    if (age == entryage){
        println("Equal")
    }
    else if(age < entryage){
        println("Less")
    }
    else {
        println("Greater")
    }

    // using when
    var day = 7
    var today= when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"

    }
println(today)
}