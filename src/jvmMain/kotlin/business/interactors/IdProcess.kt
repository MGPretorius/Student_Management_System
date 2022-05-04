package business.interactors

import java.util.*

//class IdProcess {

fun setIdGetArr(idInput: String): IntArray {
//        int[] business.interactors.IdProcess = {9, 6, 1, 1, 2, 2, 5, 0, 8, 3, 0, 8, 3};
	val personId = IntArray(13)
	//        String idProcess = "9611225083083";
	for (i in 0..12) {
		personId[i] = idInput[i].code - 48
		//            business.interactors.IdProcess[i] = new Scanner(System.in).nextInt();
	}
	return personId
}

fun getAge(id: IntArray): Int {
	var year = 0
	var month = 0
	var day = 0
	val count = 0
	var age = 0
	val date = Date()
	year = id[0] * 10
	year += id[1]
	month = id[2] * 10
	month += id[3]
	day = id[4] * 10
	day += id[5]
	age = date.year - 100 + 2000 - (1900 + year)
	if (month > date.month + 1) {
	} else {
		if (day > date.date) {
		} else age += 1
	}
	println("Age: $age")
	return age
}

fun getSex(id: IntArray): Char {
	var s = 'M'
	var value = 0
	value = id[6] * 1000
	value += id[7] * 100
	value += id[8] * 10
	value += id[9]
	s = if (value > 4999) 'M' else 'F'
	println("Gender: $s")
	return s
}

fun getCitizenship(id: IntArray): String {
	return if (id[10] == 0) {
		println("Citizenship: SA Citizen")
		"SC"
	} else {
		println("Citizenship: Permanent Resident")
		"PR"
	}
}

fun getValidity(id: IntArray): String {
	var sum = 0
	for (i in 0..12) {
		sum += id[i]
	}
	println("Valid")
	return "Valid"
}
//}