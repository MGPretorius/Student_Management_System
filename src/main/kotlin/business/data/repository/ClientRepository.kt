package business.data.repository

import business.data.models.Client

interface ClientRepository {

	// Get Client
	suspend fun getClient(clientId: String) : Client?

	// Calculate Student Age from the StudentId
	suspend fun getStudentAge(studentId: String): Int

}