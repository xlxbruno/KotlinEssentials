fun main(){
    //declaring empty hashmapOf
    val mymap = hashMapOf<String,Int>()
    //adding elements
    mymap.put("a",1000)
    mymap.put("b",100)
    mymap.put("c",10)
    println(mymap)
    //remove
    mymap.remove("c")
    println(mymap)
    //checking if value is present
    println(mymap.containsValue(10))
}

