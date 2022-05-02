//import com.company.ID
import java.util.Date
class Client(
    private val name: String,
    private val surname: String,
    private var gender: String,
    private var phoneNumber: String,
    private val ID: String,
    private val maritalStatus: String,
    private val dateCreated: Date = Date(),
) {
        var id: ID
        private var students = mutableListOf<Student>()

    init {
        println("New $maritalStatus $gender Client: $name $surname is created: $dateCreated...")
        println("Phone Number: $phoneNumber")
        id.getAge(id.setIdGetArr(ID))
        println("ID: $ID")
        println(students)
    }

    fun addStudent(name: String, surname: String, gender: String, age: Int ,phoneNumber: String, ID: String) {
        var sTemp: Student = Student(name, surname, gender, age, phoneNumber, ID)
        students.add(sTemp)
        allStudents.add(sTemp)
        println(println("New $gender Student: $name $surname is created: $dateCreated..."))
        println("Age: $age")
        println("Phone Number: $phoneNumber")
        println("ID: $ID")
    }

    fun makeStudent(): Student {
        var age: Int = id.getAge(id.setIdGetArr(ID))
        var sTemp: Student = Student(this.name, this.surname, this.gender, age, this.phoneNumber, this.ID)
        students.add(sTemp)
        allStudents.add(sTemp)
        println(println("New $gender Student: $name $surname is created: $dateCreated..."))
        println("Age: $age")
        println("Phone Number: $phoneNumber")
        println("ID: $ID")
        return sTemp
    }

    fun isStudent(): Student {
        var stemp: Student = Student(this.name, this.surname, this.gender, id.getAge(id.setIdGetArr(ID)), this.phoneNumber, this.ID)

        var s2Temp: Student = stemp
        for (i in allStudents) {
            if (i.getName() == this.name && i.getID() == this.ID) {
                println(allStudents.indexOf(i))
                println("Student Found")
                println(allStudents.size)
                s2Temp = allStudents.get(allStudents.indexOf(i))
            } else {
                println("Student Not Found")
            }
            println(i)
        }
        return s2Temp
    }

    fun getStudent(name: String, surname: String): Student {
        for (i in 0..students.size) {
            if (name == students[i].getName() && surname == students[i].getSurname()) {
                return students[i]
            }
        }
            return students[3]
    }

    fun getStudent(ID: String): Student {
        for (i in 0..students.size) {
            if (ID == students[i].getID()) {
                return students[i]
            }
        }
        return students[3]
    }

}