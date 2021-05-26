import java.util.*

fun main(){
    print("podaj pierwszą liczbę : ")
    val x = read()
    print("podaj drugą liczbę : ")
    val y = read()
    val result  = x/y
    print("wynik dzielenia to: $result")

}

fun read():Double{
    var isPropNum = false
    val read = Scanner(System.`in`)
    var num : Any? = ""
    while (!isPropNum){
        num = try {
            val r = read.nextDouble()
            isPropNum = true
            r
        }catch (ex : InputMismatchException){
            println("Nie wpisano poprawnej liczby")
            isPropNum = false
            read.next()
        }
    }
    return num.toString().toDouble()
}