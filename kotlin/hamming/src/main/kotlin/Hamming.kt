object Hamming {

    fun compute(left: String, right: String): Int {
        if (left.length != right.length) throw IllegalArgumentException("left and right strands must be of equal length")
        var count = 0
        (left.indices).forEach { i ->
            if (left[i] != right[i]) count++
        }
        return count
    }
}
