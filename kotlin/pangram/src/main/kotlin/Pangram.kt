object Pangram {

    fun isPangram(input: String): Boolean {
        if (input.length < 26) return false
        val s = input.toLowerCase();
        ('a'..'z').forEach {
            if (!s.contains(it)) return false
        }
        return true
    }
}
