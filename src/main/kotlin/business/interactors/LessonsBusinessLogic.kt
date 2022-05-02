package business.interactors

import business.data.models.Lesson
import java.util.*


private var lessons = mutableListOf<Lesson>()
private var totalLessons: Int = 0

fun lessonAttended(
	attendance: Boolean,
	late: Boolean,
	homeWork: Boolean,
	curiosity: Boolean,
	overallMood: String,
	otherComments: String = ""
) {
	var check: Boolean = lessons.add(Lesson(attendance, late, homeWork, curiosity, overallMood, otherComments))
	when (check) {
		true -> {
			println("business.data.models.Lesson Data Logged at ${Date()}")
			totalLessons += 1
		}
		false -> println("No business.data.models.Lesson Data Logged. ${Date()}")
	}
}
