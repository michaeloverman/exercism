import java.lang.Math.hypot
import java.lang.Math.sqrt

object Darts {
    fun score(x: Number, y: Number): Int {
        val dist = hypot(x.toDouble(), y.toDouble())
        return when {
            dist <= 1.0 -> 10
            dist <= 5.0 -> 5
            dist <= 10.0 -> 1
            else -> 0
        }
    }
}
