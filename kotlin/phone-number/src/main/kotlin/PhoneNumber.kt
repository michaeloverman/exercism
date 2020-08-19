import java.lang.IllegalArgumentException

class PhoneNumber(_input: String) {
    var validNum = ""
    val pattern = Regex("[2-9][0-9]{2}[2-9][0-9]{6}")
    init {
        validNum = _input.filter { it.isDigit() }
        when (validNum.length) {
            10 -> require(pattern.matches(validNum))
            11 -> {
                require(validNum.first() == '1')
                validNum = validNum.substring(1)
                require(pattern.matches(validNum))
            }
            else -> throw IllegalArgumentException()
        }
    }
    val number: String? = validNum
}
