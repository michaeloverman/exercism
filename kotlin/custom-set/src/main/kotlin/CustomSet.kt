class CustomSet(vararg i: Int) {
    private var s: MutableSet<Int> = i.toMutableSet()

    fun isEmpty() = s.isEmpty()

    fun isSubset(other: CustomSet) = s.all { other.s.contains(it) }

    fun isDisjoint(other: CustomSet) = s.none { other.s.contains(it) }

    fun contains(other: Int) = s.contains(other)

    fun intersection(other: CustomSet): CustomSet {
        var intersect = CustomSet()
        s.forEach { if (other.contains(it)) intersect.add(it) }
        return intersect
    }

    fun add(other: Int) = s.add(other)

    override fun equals(other: Any?) = when (other) {
        !is CustomSet -> false
        else -> s.all { it in other.s } && other.s.all { it in s }
    }

    operator fun plus(other: CustomSet): CustomSet {
        var newSet = CustomSet()
        s.forEach { newSet.add(it) }
        other.s.forEach { newSet.add(it) }
        return newSet
    }

    operator fun minus(other: CustomSet): CustomSet {
        var newSet = CustomSet()
        s.forEach { if (!other.s.contains(it)) newSet.add(it) }
        return newSet
    }
}
