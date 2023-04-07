fun main() {
    // while loop - executes a block of code as long as the specified condition is true
    // to print 1 to 5
    var index = 1
    while (index < 6) {
        println(index)
        index++  // the inc or dec operator works to bring the loop to an end
    }


    println(".............................")
    // do....while loop - executes code first, checks condition then executes 2nd condition considering condition
    var i = 1
    do {
        println(i)
        i++
    } while (i < 6)

    // for in loop to work on arrays
    var cars = arrayOf("BMW", "TOYOTA")
    for(x in cars){
        println(x)
    }

    /*break and continue*/
    // break -stops a loop
    // place after print and or inc/dec
    var egbreak = 0

    while(egbreak < 10){
        println(egbreak)
        egbreak++
        if(egbreak == 4){
            break


        }
    }
    println("..........................")
    var egcont = 1
    while (egcont < 10){
        if(egcont == 4){
            egcont++
            continue
        }
        println(egcont)
        egcont++
    }
}