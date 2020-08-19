object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
//        require(s.length >= n)
//        require(n > 0)
//        return (0..s.length-n).map { start ->
//            (0 until n).map { i ->
//                Character.getNumericValue(s[start + i])
//            }
//        }
        require(s.length >= n && n > 0)
        return s.map { Character.getNumericValue(it) }.windowed(n, 1)
    }
}
