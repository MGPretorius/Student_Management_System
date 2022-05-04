package business.data.repository.student.impl

import business.data.models.Student
import business.data.repository.student.StudentRepository

class StudentRepositoryImpl : StudentRepository {
	override suspend fun addStudent(student: Student) {
		TODO("Not yet implemented")
	}

	override suspend fun getStudentById(studentId: String): Student? {
		TODO("Not yet implemented")
	}

	override suspend fun getStudentBySurname(studentSurname: String): Student? {
		TODO("Not yet implemented")
	}

	override suspend fun getStudentAge(studentId: String): Int {
		TODO("Not yet implemented")
	}
}