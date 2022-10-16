import java.time.Year
import java.util.logging.XMLFormatter

fun main() {
 val point = Point(1, 2, 3, 4,)
 val fraction = Fraction(1, 2, 3, 4)

println(point.toString())
println(point.equals())
println(point.Simetriuli())
println(fraction.gamravleba())



}

class Point(X: Int, Y: Int, X2: Int, Y2: int) {

    val X = X
    val Y = Y
    val X2 = X2
    val Y2 = Y2


}

fun Simetriuli(): String {
    val SimetriuliX = -X
    val SimetriuliY = -Y

    return "($SimetriuliX; $SimetriuliY)"
}



class Fraction(numerator: Int, denominator: Int, secnumerator: Int, secdenominator: Int) {
    val numerator = numerator
    val denominator = denominator
    val secdenominator = secdenominator
    val secnumerator = secnumerator



}

fun gamravleba(){

    val finalNumerator = numerator + secnumerator
    val finalDenominator = denominator + secdominator

    println("Pasuxi: $finalNumerator/$finalDenominator" + " = " + (numerator*secnumerator).toDouble()/(denominator*secdenomminator).toDouble())

}


