object Transpose {

    fun transpose(input: List<String>): List<String> {
        if (input.isEmpty()) return listOf<String>()
        val lines = input.size
        val longest = input.maxBy { it.length }!!.length
        val output = mutableListOf<String>()
        (0 until longest).forEach { i ->
            var str = ""
            input.forEachIndexed { j, it ->
                if (it.length > i) {
                    str += it[i]
                } else {
                    if (j < lines - 1) str += " "
                }
            }
            output.add(str)
        }

        // Trim trailing spaces from last lines until find one without
        var idx = longest - 1
        while (output[idx].endsWith(" ")) {
            output[idx] = output[idx].trimEnd()
            idx--
        }
        return output
    }
}
