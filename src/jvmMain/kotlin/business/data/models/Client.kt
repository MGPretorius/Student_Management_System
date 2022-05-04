package business.data.models

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class Client(
	val name: String,
	val surname: String,
	val gender: String? = null,
	val phoneNumber: String? = null,
	val clientId: String? = null,
	val maritalStatus: String? = null,
	val timestamp: Long = System.currentTimeMillis(),
	@BsonId
	val id: String = ObjectId().toString()
)
