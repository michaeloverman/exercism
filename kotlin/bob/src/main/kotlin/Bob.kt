object Bob {
    fun hey(input: String) =
            when {
                input.trim().isEmpty() -> "Fine. Be that way!"
                input.filter { it.isLetter() }.isNotEmpty() &&
                        input.filter { it.isLetter() && it.isUpperCase() } == input.filter { it.isLetter() } ->
                        if (input.trim().last() == '?')  "Calm down, I know what I'm doing!"
                        else "Whoa, chill out!"
                input.trim().last() == '?' -> "Sure."
                else -> "Whatever."
            }
}
