object Acronym {
    fun generate(phrase: String) =
        phrase.split("""[\s_-]""".toRegex())
                .filter { it.isNotEmpty() }
                .map { it[0].toUpperCase() }
                .joinToString("")
}
