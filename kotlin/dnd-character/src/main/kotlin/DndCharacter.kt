import java.lang.Math.floor

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {
        var d6 = setOf(1, 2, 3, 4, 5, 6)

        fun ability(): Int {
            var rolls = mutableListOf<Int>()
            (1..4).forEach {
                rolls.add(d6.shuffled().first())
            }
            return rolls.sum() - rolls.min()!!
        }

        fun modifier(score: Int): Int {
            return kotlin.math.floor((score.toDouble() - 10.0) / 2).toInt()
        }
    }
}
