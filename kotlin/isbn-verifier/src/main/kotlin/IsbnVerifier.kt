class IsbnVerifier {

    fun isValid(number: String): Boolean {
        val pure = number.filter { it != '-' } // Remove hyphens
        if (pure.length != 10 || !pure.matches("^[0-9]+[0-9X]$".toRegex()) ) return false // Confirm proper characters
        return pure.mapIndexed { i, c ->
                when { // Calculate each digit
                    i < 9 -> Character.getNumericValue(c) * (10 - i)
                    else -> if (c == 'X') 10 else Character.getNumericValue(c)
                }
            }.sum() % 11 == 0 // Sum and confirm
    }
}
