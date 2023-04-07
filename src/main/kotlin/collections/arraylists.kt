// Lists in kotlin are an ordered collection of elements that allow duplicates
// to define one : choose whether you want a mutable or immutable list
// ARRAYLIST : objects
// Array lists create dynamic arrays
// by dynamic meaning we have the ability to increase or decrease the size of an array
// arraylists can contain duplicates

// defination
// constructors
//1.ArrayList<E>() : creates an empty ArrayList
//2. ArrayList(capacity:Int) - creates an array list of a specified size
//3. ArrayList(elements: Collection<E>): - creates an array list filled with collection elements


// To add to an arrayList
// add(index:Int , element: E): Boolean
// -1 : referencing the last object in the array list


fun main(){
    val arraylist = ArrayList<String>()
    arraylist.add("First string")
    arraylist.add("First string")
    println(".....................")
    for(x in arraylist){
        println(x)
    }
    arraylist.add(1, "Second string")
    println("................")
    for (x in arraylist){
        println(x)
    }

    var arraylist2 = ArrayList<String>()
    println("...........adding collection to arraylist.......")
    arraylist2.addAll(arraylist)
    arraylist2.add(1, "Third string")
    for(x in arraylist){
        println(x)
    }

    println(".........accessing items using get.......")
    println("Item at 1st position " + arraylist2.get(0))
    for(x in arraylist){
        println(x)
    }

    println(".......get index postion of element......")
    println("Index position of element third string is " + arraylist2.indexOf("Third string"))

    println("........remove elements.........")
    arraylist2.remove("Third String")
    for(x in arraylist){
        println(x)
    }

    println("..........clearing/ empting arraylists.........")
    arraylist2.clear()

}