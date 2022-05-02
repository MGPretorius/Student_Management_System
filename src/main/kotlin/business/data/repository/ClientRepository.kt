package business.data.repository

import business.data.models.Client

interface ClientRepository {

	 var client :Client

	fun getStudentAge(studentId: String): Int {
		return getAge(client.clientId)
	}


}