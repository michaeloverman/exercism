object Hamming {

    fun compute(left: String, right: String): Int {
        require(left.length == right.length) {"left and right strands must be of equal length"}
        return left.filterIndexed { i, c -> c != right[i] }.count()
    }
}
