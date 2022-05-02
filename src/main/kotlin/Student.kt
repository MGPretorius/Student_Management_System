import java.util.*

//var lessonlocation: Location,
class Student(
    private val name: String,
    private val surname: String,
    private var gender: String,
    private var age: Int,
    private var phoneNumber: String,
    private val ID: String,
    private var lessonDuration: Int = 30,
    private var lessonTimeSlot: String = "",
    //private val dateCreated: Date = Date()
) {
    private var lessons = mutableListOf<Lesson>()
    private var totalLessons: Int = 0

    init {/*
        println(println("New $gender Student: $name $surname is created: $dateCreated..."))
        println("Age: $age")
        println("Phone Number: $phoneNumber")
        println("ID: $ID")
    */}
    fun getName(): String {
        return name
    }
    fun getSurname(): String {
        return surname
    }
    fun getAge(): Int {
        return age
    }
    fun getID(): String {
        return ID
    }
    fun lessonAttended(attendance: Boolean,
                       late: Boolean,
                       homeWork: Boolean,
                       curiosity: Boolean,
                       overallMood: String,
                       otherComments: String = "") {
        var check: Boolean = lessons.add(Lesson(attendance, late, homeWork, curiosity, overallMood, otherComments))
        when (check) {
            true -> {
                println("Lesson Data Logged at ${Date()}")
                totalLessons += 1
            }
            false -> println("No Lesson Data Logged. ${Date()}")
        }
    }

    fun getlessonDuration(): Int {
        return lessonDuration
    }
    fun getlessonTimeSlot(): String {
        return lessonTimeSlot
    }

    fun setLessons(newlessonDuration: Int, newlessonTimeSlot: String): Boolean {
        if (newlessonDuration > 60 && newlessonDuration < 30) {
            return false
        } else {
            lessonDuration = newlessonDuration
        }

        for (runStudent in allStudents) {
            if (lessonTimeSlot == runStudent.lessonTimeSlot) {
                return false
            } else {
                lessonTimeSlot = newlessonTimeSlot
                return true
            }
        }
        return true
    }

    fun getProgres() {
        //println(lessons)
    }

}