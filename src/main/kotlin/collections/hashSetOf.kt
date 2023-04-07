//to create mutable setOf
//similar to sets but can be edited

fun main(){
    val set1 = hashSetOf<Int>(1,2,3,4)
    val set2 = hashSetOf("1",2,3,4)
    val set3 = hashSetOf(5,6,7)

    //remove elements
    set1.remove(1)

    //add elements
    set1.add(8)

    println(set1)

}

