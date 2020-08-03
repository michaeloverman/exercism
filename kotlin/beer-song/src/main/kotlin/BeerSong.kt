object BeerSong {
    fun verses(startBottles: Int, takeDown: Int) =
        (startBottles downTo takeDown).map { n ->
            "${bots(n, true).capitalize()}, ${bots(n, false)}.\n" +
            "${if (n > 0) "Take ${if (n > 1) "one" else "it"} down and pass it around, ${bots(n - 1, true)}" else
            "Go to the store and buy some more, ${bots(99, true)}"}.\n"
        }.joinToString("\n")

    private fun bots(n: Int, wall: Boolean) = when (n) {
        1 -> "1 bottle"
        0 -> "no more bottles"
        else -> "$n bottles"
    } + " of beer" + if (wall) " on the wall" else ""
}
