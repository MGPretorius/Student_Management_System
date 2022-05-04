package business.data.models

data class Lesson(
	val attendance: Boolean = false,
	val late: Boolean = false,
	val homeWork: Boolean = false,
	val curiosity: Boolean = false,
	val overallMood: String = "NA",
	val otherComments: String = "NA",
	val dateCreated: Long = System.currentTimeMillis()
)