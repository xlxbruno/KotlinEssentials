// a....x
fun main(){
    // creating a range
    // use for in loop
    for (chars in 'a'..'x'){
        println(chars)
    }
    // checking if a value exists in a range
     val nums =  1..10
        if (4 in nums){
            println("Exists")
        }
        else{
            println("Does not exist")
        }
    // break or continue a range
    for (digits in 1..20){
        if(digits == 14){
            break
        }
        println(digits)

    }
    println("....................")
    for(digit in 1..20){
        if(digit == 14){
            continue
        }
        println(digit)
    }
}