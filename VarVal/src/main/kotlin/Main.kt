import kotlin.math.sqrt

fun main(){
    var a: Double = 7.0
    val b: Double = 3.0 // val == immutable

    a = 4.0

    println("Obliczanie przeciwprostokątnej trójkąta o przyprostokątnych:")
    println("a = $a , b = $b")

    var c = (a*a) + (b*b)
    c = sqrt(c)

    println("\ndługość przeciwprostokątnej : $c")

    println("\ntypy danych : ")
    val words : String = "łańcuch znaków"
    println("String : $words")
    val intType : Int = 32
    println("Int : $intType (liczba całkowita)")
    val doubleTye : Double = 12.0344
    println("Double : $doubleTye (zmienno przecinkowa podwójnej precyzji)")
    val fType : Float = 64.3f
    println("Float : $fType (zmiennoprzecinkowa)")
    val shType : Short = 4
    println("Short : $shType (całkowita 'krótka')")
    val lType : Long = 2694765203485403875
    println("Long : $lType (całkowita - 64-bit)")
    val bType : Boolean = true
    println("Boolean : $bType (lub false)")

    var num : Number = c // can keep any numeric value
    num = fType
    num = intType

    var anyType : Any = words // can keep any simple type
    anyType = lType
    anyType = bType
}