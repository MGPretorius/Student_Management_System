package business.data.models

//var lessonLocation: Location,
data class Student(
	val name: String,
	val surname: String,
	val gender: String,
	val age: Int,
	val phoneNumber: String,
	val studentId: String,
	val lessonDuration: Int = 30,
	val lessonTimeSlot: String = "",
	//private val dateCreated: Date = Date()
)