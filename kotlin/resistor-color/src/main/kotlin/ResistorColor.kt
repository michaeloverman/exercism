object ResistorColor {

    fun colorCode(input: String): Int = colors().indexOf(input)

    fun colors(): List<String> = listOf<String>("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")

}
