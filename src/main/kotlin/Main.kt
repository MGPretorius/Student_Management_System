fun main(args: Array<String>) {
    var John = Client(
        name = "John",
        surname = "Jackson",
        gender = "M",
        phoneNumber = "0873627365",
        ID = "9611225083083",
        maritalStatus = "Not Married"
    )
    //John.addStudent("Robby", "Jackson", "M", 17, "0873627365", "9611225083083")
    //println(John.getStudent("9611225083083").getName())
    //println(John.getStudent("Robby", "Jackson").getAge())
    //println(John.getStudent("9611225083083").setLessons(30, "2:30"))
    //John.makeStudent()
    //John.isStudent().setLessons(30, "4:00")

    John.isStudent().lessonAttended(true, false, true, true, "Positive")

}