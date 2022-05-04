package business.data.repository.student

import business.data.models.Student

interface StudentRepository {

	suspend fun addStudent(student: Student)

	suspend fun getStudentById(studentId: String): Student?
	suspend fun getStudentBySurname(studentSurname: String): Student?

	// Calculate Student Age from the StudentId
	suspend fun getStudentAge(studentId: String): Int

}