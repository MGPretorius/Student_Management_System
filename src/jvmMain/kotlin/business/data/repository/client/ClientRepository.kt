package business.data.repository.client

import business.data.models.Client

interface ClientRepository {

	suspend fun addClient(client: Client)

	// Get Client
	suspend fun getClientById(clientId: String): Client?
	suspend fun getClientBySurname(surname: String): Client?

	// Calculate Student Age from the StudentId
	suspend fun getClientAge(clientId: String): Int

}