fun main(){
    val numbers = listOf(1,2,3,4,5)
    val firstnumber = numbers[0]
    println(numbers.size)

    //access last element
    val lastnumber = numbers.size - 1
    println(numbers[lastnumber])
    for(x in numbers){
        println(x)
    }

    // index of
    println(numbers.indexOf(4))
    println("............................first and last")
    println(numbers.first())
    println(numbers.last())

    val names = listOf("Francis", "John", "James", "David")
    println(".............................")
    for (name in names){
        println("${name}")
    }
    println("....................................")
    for (i in 0 until names.size){
        println("${names[1]}")
    }
    println("............................................")
    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()){
        val i = it.next()
        println(i)
    }
    val ascending = names.sorted()
    println("............................accending...................")
    println(ascending)

    val descending = names.sortedDescending()
    println("..................................")
    println(descending)

    println("Checking for a single value in a list")
    val check = names.contains("Francis")
    println(check)
    println("range check.........................")

    val rangeCheck = names.containsAll(listOf("Francis", "James"))
    println(rangeCheck)
    if (rangeCheck){
        println("Name exists")
    } else {
        println("Name does not exist")
    }
}


