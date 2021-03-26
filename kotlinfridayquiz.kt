package kotlinquizfriday

fun main(){
    //1.
    for (i in 0..9){
        println(i)
    }

    //2.
    var name:String? = "Abdi"
    name = null

    //3
    var x : Long? = 2
    x=null

    //4
    var myName = "Ali"
    var yourName = "John"
    if (myName.length > yourName.length){
        println("Ali has more characters")
    }else{
        println("John has more characters")
    }

    //5
    println("Enter a string text : ")
    var str = readLine()
    if (str != null) {
        checkForA(str)
    }

    //6
    var lambda = {a:Int,b:Int,c:Int -> a + b + c}

    //7 = outside of the mai function

    //8
    var animals = arrayOf("Mbuzi","Kondoo","Ngombe")

    //9
    var bestLanguage = "kotlin"
    var countOfCharacters = bestLanguage.length
    println("Count of characters in kotlin is $countOfCharacters")

    //10
    var hellWorld = { str:String-> println(str)}
    println("${hellWorld("hello world")}")
}
//5 function definition
fun checkForA(str:String){
    for (i in 0..str.length){
        var lookingFor:Char = 'a'
        var charInStr = str.get(i)
        if( charInStr == lookingFor){
            println("Character 'a' was found in the word")
            break
        }
    }
}

//7 declaring class
class Car{
    private  var brand:String = "Toyota"
    private  var model : String = "Landcruiser"
    fun accelerate(){
       println("Accelerates to 100km/hr in 15 seconds")
    }
    fun color(){
        println("The color of the car is white")
    }
}