package business.data.models

data class Client(
	val id: String,
	val name: String,
	val surname: String,
	val gender: String? = null,
	val phoneNumber: String? = null,
	val clientId: String? = null,
	val maritalStatus: String? = null,
	val dateCreated: Long = System.currentTimeMillis(),
)
