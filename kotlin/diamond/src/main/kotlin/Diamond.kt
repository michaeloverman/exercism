class DiamondPrinter {

    fun printToList(max: Char): List<String> {
        var diamond = mutableListOf<String>()
        if (max == 'A') {
            diamond.add("A")
            return diamond
        }
        diamond.add("$max${" ".repeat(((max - 'A') * 2) - 1)}$max")
        (max - 1 downTo 'B').forEach {
            val s = "${" ".repeat(max - it)}$it${" ".repeat(((it - 'A') * 2) - 1)}$it${" ".repeat(max - it)}"
            diamond.add(s)
            diamond.add(0, s)
        }
        // Have to do 'A' by itself, since it's only there once
        val s = "${" ".repeat(max - 'A')}A${" ".repeat(max - 'A')}"
        diamond.add(s)
        diamond.add(0, s)

        return diamond
    }

}
