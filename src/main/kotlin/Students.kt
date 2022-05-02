import java.util.*

var allStudents = mutableListOf<Student>()

abstract class Students(private val name: String,
               private val surname: String,
               private var gender: String,
               private var age: Int,
               private var phoneNumber: String,
               private val ID: String,
               private var lessonDuration: Int = 30,
               private var lessonTimeSlot: String = "2:30",
               private val dateCreated: Date = Date()
) {

}