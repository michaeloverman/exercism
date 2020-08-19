object ScrabbleScore {

    fun scoreLetter(c: Char) = when (c.toUpperCase()){
        in "AEIOULNRST" -> 1
        in "DG"         -> 2
        in "BCMP"       -> 3
        in "FHVWY"      -> 4
        in "K"          -> 5
        in "JX"         -> 8
        in "QZ"         -> 10
        else -> 0 // invalid char submitted
    }

    fun scoreWord(word: String) = word.map { scoreLetter(it) }.sum()
}
