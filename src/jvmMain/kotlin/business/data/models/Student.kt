package business.data.models

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

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
	val timestamp: Long = System.currentTimeMillis(),
	@BsonId
	val id: String = ObjectId().toString()
)