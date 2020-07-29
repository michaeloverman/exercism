object PigLatin {
    fun translate(phrase: String) =
        phrase.split(" ").joinToString(separator = " ", transform = { translateWord(it) })

    fun translateWord(phrase: String) =
        when {
            phrase.startsWith("squ") || phrase.startsWith("thr") || phrase.startsWith("sch") ->
                phrase.substring(3) + phrase.substring(0..2) + "ay"
            phrase.startsWith("ch") || phrase.startsWith("sh") || phrase.startsWith("rhy") ||
                phrase.startsWith("th") || phrase.startsWith("qu") ->
                phrase.substring(2) + phrase.substring(0..1) + "ay"
            phrase.startsWith("xr") || phrase.startsWith("yt") -> phrase + "ay"
            phrase[0] == 'a' || phrase[0] == 'e' || phrase[0] == 'i' || phrase[0] == 'o' || phrase[0] == 'u' -> phrase + "ay"
            else -> phrase.substring(1) + phrase[0] + "ay"
        }
}
