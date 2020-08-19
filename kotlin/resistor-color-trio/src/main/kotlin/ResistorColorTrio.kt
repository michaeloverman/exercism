import java.lang.Math.pow

object ResistorColorTrio {

    fun text(vararg input: Color): String {
        var digits = (input[0].ordinal * 10 + input[1].ordinal) * (pow(10.0, input[2].ordinal.toDouble())).toInt()
        var unit = 0
        while (digits > 1000 && digits % 1000 == 0) {
            digits /= 1000
            unit++
        }
        val u = Unit.values()[unit]
        return "$digits ${u.toString().toLowerCase()}"
    }
}
