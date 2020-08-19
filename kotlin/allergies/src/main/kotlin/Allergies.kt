class Allergies(val score: Int) {

    fun getList() = Allergen.values().filter { it.score and score != 0 }

    fun isAllergicTo(allergen: Allergen) = allergen.score and score != 0
}
