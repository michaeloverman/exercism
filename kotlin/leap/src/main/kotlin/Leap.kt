data class Year(val todo: Int) {

    val isLeap: Boolean = when {
        todo % 400 == 0 -> true
        todo % 100 == 0 -> false
        else -> todo % 4 == 0
    }
}
