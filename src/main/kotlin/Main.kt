import business.data.models.Client
import business.data.models.Student

fun main(args: Array<String>) {
	val clientJohn = Client(
		name = "John",
		surname = "Jackson",
		gender = "M",
		phoneNumber = "0873627365",
		clientId = "9611225083083",
		maritalStatus = "Not Married"
	)
	val studentJohn = Student(
		name = "John",
		surname = "Jackson",
		gender = "M",
		phoneNumber = "0873627365",
		studentId = "9611225083083"
	)
	//John.addStudent("Robby", "Jackson", "M", 17, "0873627365", "9611225083083")
	//println(John.getStudent("9611225083083").getName())
	//println(John.getStudent("Robby", "Jackson").getAge())
	//println(John.getStudent("9611225083083").setLessons(30, "2:30"))
	//John.makeStudent()
	//John.isStudent().setLessons(30, "4:00")

	john.isStudent().lessonAttended(true, false, true, true, "Positive")

}