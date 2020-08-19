fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble() // found: https://discuss.kotlinlang.org/t/how-do-you-round-a-number-to-n-decimal-places/8843/4

class SpaceAge(seconds: Long) {
    private val years = seconds.toDouble() / 31557600
    fun onEarth(): Double = years.round()
    fun onMercury(): Double = (years / 0.2408467).round()
    fun onVenus(): Double = (years / 0.61519726).round()
    fun onMars(): Double = (years / 1.8808158).round()
    fun onJupiter(): Double = (years / 11.862615).round()
    fun onSaturn(): Double = (years / 29.447498).round()
    fun onUranus(): Double = (years / 84.016846).round()
    fun onNeptune(): Double = (years / 164.79132).round()
}
