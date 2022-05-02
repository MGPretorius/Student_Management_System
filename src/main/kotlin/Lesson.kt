import java.awt.Point
import java.sql.Time
import java.time.Duration
import java.util.*

class Lesson(
    private val attendance: Boolean = false,
    private val late: Boolean = false,
    private val homeWork: Boolean = false,
    private val curiosity: Boolean = false,
    private val overallMood: String = "NA",
    private val otherComments: String = "NA",

    private val dateCreated: Date = Date()

) {
    init {
        println("...")
        //println("$lessonTimeSlot Lesson $lessonDuration min Completed! at lessonlocation ${dateCreated}")
    }


}
