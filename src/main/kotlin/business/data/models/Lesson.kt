package business.data.models

import java.util.*

data class Lesson(
	private val attendance: Boolean = false,
	private val late: Boolean = false,
	private val homeWork: Boolean = false,
	private val curiosity: Boolean = false,
	private val overallMood: String = "NA",
	private val otherComments: String = "NA",
	private val dateCreated: Date = Date()

)