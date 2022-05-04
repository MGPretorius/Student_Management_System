package presentation.services

import business.data.models.Client
import business.data.repository.client.ClientRepository

/*
* This type of file and also be called *UseCase as it serve the Presentation layer
* however using MVVM / Clean Architecture (when used in Android) it focuses on business rules / Use Cases
* It is sort of the layer between the View and the Data/Repository
* */
class ClientService(private val clientRepository: ClientRepository) {

	suspend fun addClient(client: Client) {
		return clientRepository.addClient(client)
	}

	// Get Client
	suspend fun getClientById(clientId: String): Client? {
		return clientRepository.getClientById(clientId)
	}

	suspend fun getClientBySurname(surname: String): Client? {
		return clientRepository.getClientBySurname(surname)
	}

	// Calculate Student Age from the StudentId
	suspend fun getClientAge(clientId: String): Int {
		return getClientAge(clientId)
	}

}