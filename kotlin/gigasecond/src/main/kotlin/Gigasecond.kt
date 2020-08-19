import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(_datetime: LocalDateTime) {
    constructor(_date: LocalDate) : this(_date.atStartOfDay())
    val date: LocalDateTime = _datetime.plusSeconds(1_000_000_000) // seconds
}
