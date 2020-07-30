object ResistorColorDuo {

    fun value(vararg inputs: Color): Int =
        colors.indexOf(inputs[0]) * 10 + colors.indexOf(inputs[1])

    private val colors: List<Color> = listOf(Color.BLACK, Color.BROWN, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.VIOLET, Color.GREY, Color.WHITE)
}
