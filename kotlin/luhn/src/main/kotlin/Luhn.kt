object Luhn {

    fun isValid(candidate: String): Boolean {
        var numStr = candidate.filter { it != ' ' } // remove spaces
        if (numStr.length < 2) return false // more than one digit
        var num: Long? = numStr.toLongOrNull() ?: return false // just numbers?
        num = num!!
        var sum = 0L
        var dub = false
        while (num > 0) {
            sum += if (dub) {
                var x = 2 * (num % 10)
                if (x > 9) x - 9 else x
            } else num % 10
            num /= 10
            dub = !dub
        }
        return sum % 10 == 0L
    }
}
