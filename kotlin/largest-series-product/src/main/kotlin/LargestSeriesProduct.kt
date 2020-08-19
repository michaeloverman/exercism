class Series(val input: String) {

    init {
        require(input.all { it.isDigit() })
    }

    fun getLargestProduct(span: Int): Long {
        require(span <= input.length && span >= 0)
        return when {
            span == 0 -> 1L
            else -> input.map { Character.getNumericValue(it).toLong() } // Convert string to numbers
                    .windowed(span, 1)                             // Make lists of <span> length
                    .map { it.reduce { acc, i -> acc * i } }             // Find product of each list
                    .max()!!                                             // return max
        }
    }
}
