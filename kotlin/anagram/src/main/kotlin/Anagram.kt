class Anagram(val term: String) {

    fun match(anagrams: Collection<String>) =
        anagrams.filter {
            term.toLowerCase().toCharArray().sorted() == it.toLowerCase().toCharArray().sorted() && term.toLowerCase() != it.toLowerCase() }.toSet()
}
