fun main(){
    //define set off
    val set1 = setOf("Geek", "Wiz", "IT")
    val set2 = setOf("Geek", "Wiz", "IT", 7, true)
    // to iterate
    for (x in set1){
        println(x)
    }
    //access element in specified index
    println(set1.elementAt(2))

    //access index based on  element
    println(set2.indexOf("Wiz"))
    println(set2.lastIndexOf(true))

    // get the set's 1st and last element
    println(set1.first())
    println(set1.last())

    //basic integer functions
    val num = setOf<Int>(1, 2, 10, 20, 0,10000000, 200 )
    println(num.count())//no of items in collection
    println(num.sum())//no of items in collection
    println(num.min())//no of items in collection
    println(num.max())//no of items in collection
    println(num.average())//no of items in collection

    //check if set is empty
    println(set2.isEmpty())
    //if two sets are equal
    val set3 = setOf(1, 2, 3, 4)
    val set4 = setOf(1,2,3,4)
    val set5 = setOf(1,2,3,4)
    val set6 = setOf(true, 1,2,3)
    println("is set3 equal to set4 : ${set3 == set4}")
    println("is set5 equal to set6 : ${set5 == set6}")

    // wheteher set contains some data
    println(set2.contains("Hanks"))
    println(set2.containsAll(setOf(true, "IT", "Wiz")))

}

