package business.data.repository.impl

import business.data.models.Client
import business.data.repository.ClientRepository

class FakeClientRepository: ClientRepository {

	// Fake Client data
	val client1 = Client(
		"Matthys",
		"Pretorius",
		"M",
		"+27847012712",
	)
	val client2 = Client(
		"Corrie",
		"Pretorius",
		"M",
		"+27824515814",
	)

	val clients = listOf(
		client1, client2
	)


	override suspend fun getClient(clientId: String): Client? {
		TODO("Not yet implemented")
	}

	override suspend fun getStudentAge(studentId: String): Int {
		TODO("Not yet implemented")
	}
}