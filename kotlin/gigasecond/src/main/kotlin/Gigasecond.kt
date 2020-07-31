import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(_datetime: LocalDateTime) {
    constructor(_date: LocalDate) : this(LocalDateTime.of(_date.year, _date.month, _date.dayOfMonth, 0, 0, 0))
    val date: LocalDateTime = _datetime.plusSeconds(1000000000) // seconds
}
