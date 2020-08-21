data class MinesweeperBoard(val board: List<String>) {
    private var boardWNum: List<String>
    init {
        boardWNum = if (board.isEmpty()) listOf<String>() else {
            board.mapIndexed { r, row -> // ...do all the rows
                row.mapIndexed { c, ch -> // ... and all chars in each row
                    if (ch == '*') "*" else { // if it's a bomb, it's a bomb
                        // count the neighbors:
                        var count = board.filterIndexed { x, xrow -> x in r - 1..r + 1 } // take row and one up/down
                                .map { it.filterIndexed { y, ycol -> y in c - 1..c + 1 } } // take char and one left/right
                                .joinToString("").count { it == '*' } // put all together and count the bombs
                        if (count == 0) " " else count.toString() // rewrite appropriately
                    }
                }.joinToString("")
            }
        }
    }

    fun withNumbers() = boardWNum
}
