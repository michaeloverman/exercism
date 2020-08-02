import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val p = input.toString().length.toDouble()
        var sum = 0
        var i = input
        while (i > 0) {
            sum += (i % 10).toDouble().pow(p).toInt()
            i /= 10
        }
        return sum == input
    }

}
