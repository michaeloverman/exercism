object Isogram {

    fun isIsogram(input: String): Boolean {
        val s = input.toLowerCase().filter { it.isLetter() }
        return s.length == s.toSet().size
    }
}
