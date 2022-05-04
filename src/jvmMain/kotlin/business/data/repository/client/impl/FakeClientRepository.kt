package business.data.repository.client.impl

import business.data.models.Client
import business.data.repository.client.ClientRepository
import business.interactors.getAge
import business.interactors.setIdGetArr

class FakeClientRepository() : ClientRepository {

	private val clients = mutableListOf<Client>()

	override suspend fun addClient(client: Client) {
		clients.add(client)
	}

	override suspend fun getClientById(clientId: String): Client? {
		return clients.find { client -> client.id == clientId }
	}

	override suspend fun getClientBySurname(surname: String): Client? {
		return clients.find { it.surname == surname }
	}

	override suspend fun getClientAge(clientId: String): Int {
		return getAge(setIdGetArr(clientId))
	}
}