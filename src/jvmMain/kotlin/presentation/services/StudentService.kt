package presentation.services

/*
* This Code need to moved in different files
* consider separation of concerns and in which layer of the app it belongs
* It is commented out, so it does not stop building
* */
//class StudentService() {
//
//	private var client: Client = Client(name = "", surname = "")
//	lateinit var idProcess: IdProcess
//	private var students = mutableListOf<Student>()
//	var allStudents = mutableListOf<Student>()
//
//	init {
//		println("New ${client.maritalStatus} ${client.gender} presentation.services.StudentService: ${client.name} $surname is created:" +
//				" $dateCreated...")
//		println("Phone Number: ${client.phoneNumber}")
//		idProcess.getAge(idProcess.setIdGetArr(IdProcess))
//		println("business.interactors.IdProcess: $IdProcess")
//		println(students)
//	}
//
//	// Add business.data.models.Student to List
//	fun addStudent(name: String, surname: String, gender: String, age: Int, phoneNumber: String, ID: String) {
//		var sTemp: Student = Student(name, surname, gender, age, phoneNumber, ID)
//		students.add(sTemp)
//		allStudents.add(sTemp)
//		println(println("New $gender business.data.models.Student: $name $surname is created: $dateCreated..."))
//		println("Age: $age")
//		println("Phone Number: $phoneNumber")
//		println("business.interactors.IdProcess: $ID")
//	}
//
//	fun makeStudent(): Student {
//		var age: Int = idProcess.getAge(idProcess.setIdGetArr(IdProcess))
//		var sTemp: Student = Student(this.name, this.surname, this.gender, age, this.phoneNumber, this.ID)
//		students.add(sTemp)
//		allStudents.add(sTemp)
//		println(println("New $gender business.data.models.Student: $name $surname is created: $dateCreated..."))
//		println("Age: $age")
//		println("Phone Number: $phoneNumber")
//		println("business.interactors.IdProcess: $IdProcess")
//		return sTemp
//	}
//
//	fun isStudent(): Student {
//		var stemp: Student =
//			Student(
//				this.name,
//				this.surname,
//				this.gender,
//				idProcess.getAge(idProcess.setIdGetArr(IdProcess)),
//				this.phoneNumber,
//				this.ID
//			)
//
//		var s2Temp: Student = stemp
//		for (i in allStudents) {
//			if (i.getName() == this.name && i.getID() == this.ID) {
//				println(allStudents.indexOf(i))
//				println("business.data.models.Student Found")
//				println(allStudents.size)
//				s2Temp = allStudents.get(allStudents.indexOf(i))
//			} else {
//				println("business.data.models.Student Not Found")
//			}
//			println(i)
//		}
//		return s2Temp
//	}
//
//	fun getStudent(name: String, surname: String): Student {
//		for (i in 0..students.size) {
//			if (name == students[i].getName() && surname == students[i].getSurname()) {
//				return students[i]
//			}
//		}
//		return students[3]
//	}
//
//	fun getStudent(ID: String): Student {
//		for (i in 0..students.size) {
//			if (ID == students[i].getID()) {
//				return students[i]
//			}
//		}
//		return students[3]
//	}
//
//}