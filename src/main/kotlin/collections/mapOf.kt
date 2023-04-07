fun main(){
// contains objects in pairs: keys and values
val map = mapOf(1 to "Hanks", 2 to "Bruno")
//to get keys
println(map.keys)
//to get values
println(map.values)

//to get specific value
println("To get the value 'hanks' " + map[1])
println("To get the value 'hanks' " + map.getValue(1))
println("To get the value 'hanks' " + map.getOrDefault(1,500))
println("To get the value 'hanks' " + map.getOrElse(1,{2}))

    //checking if map contains values or keys:boolean result
    println(map.containsKey(1))
    println(map.containsValue("Hanks"))
    // two values with same key:returns last value with same key
    val map2 = mapOf(1 to "Joe", 2 to "Brian", 1 to "Chandler")
    println(".......to values same key......")
    println(map2.entries)
    //keys can also be strings
    //get values associated with keys
    val names = mapOf("name" to "Hanks", "occupation" to "Pediatrician")
    println("The occupation of " + names["name"] + ":" + names["occupation"])

    //transverse maps
    for(x in map2.keys)
    {val values = map2[x]
    println(values)}

    for(x in map2.values)
    {
        println(x)}

    //for each method
    map2.forEach{key,value ->
        println("${value}")
        println("${key}")
    }

}