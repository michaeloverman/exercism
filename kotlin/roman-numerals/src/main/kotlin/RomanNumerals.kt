object RomanNumerals {
    val places = listOf(listOf("", "M", "MM", "MMM"),
                        listOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"),
                        listOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"),
                        listOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX") )
    fun value(n: Int) =
        n.toString().padStart(4, '0')
                .mapIndexed { i, c -> places[i][Character.getNumericValue(c)] }
                .joinToString("")
}
