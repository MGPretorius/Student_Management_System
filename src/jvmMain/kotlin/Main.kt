import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import business.data.models.Client
import business.data.models.Student
import presentation.services.ClientService

@Composable
@Preview
fun app() {
	var text by remember { mutableStateOf("") }
	val clientService: ClientService

	// Loading Fake Data, shortcut DON'T DO THIS
	val fakeClient = ArrayList<Client>()
	fakeClient.add(client1)
	fakeClient.add(client2)
	fakeClient.add(clientJohn)

	MaterialTheme {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.SpaceEvenly,
			modifier = Modifier
				.fillMaxSize()
				.border(1.dp, MaterialTheme.colors.surface, RoundedCornerShape(50.dp))
		) {
			LazyColumn(
				modifier = Modifier
					.background(MaterialTheme.colors.surface)
					.padding(16.dp)
					.border(
						width = 2.dp,
						color = Color.Black,
						shape = RoundedCornerShape(15.dp)
					),
				contentPadding = PaddingValues(16.dp)
			) {
				itemsIndexed(fakeClient) { _, client ->
					Column(
						Modifier
							.border(
								width = 1.dp,
								color = Color.Gray,
								shape = RoundedCornerShape(5.dp)
							)
							.padding(16.dp)
					) {
//						val citizen = getCitizenship(setIdGetArr(client.clientId ?: ""))
						Text("Client Name: ${client.name}")
						Text("Client Surname: ${client.surname}")
						Text("Client Gender: ${client.gender}")
						Text("Client Phone: ${client.phoneNumber}")
						Text("Client ID Number: ${client.clientId}")
					}
					Spacer(Modifier.height(8.dp))
				}
			}
		}
	}
}

// Fake Client data
val client1 = Client(
	name = "Matthys",
	surname = "Pretorius",
	gender = "M",
	clientId = "9611225083083",
	phoneNumber = "+27847012712",
	id = "626a72742d52290272d97937"
)
val client2 = Client(
	name = "Corrie",
	surname = "Pretorius",
	gender = "M",
	phoneNumber = "+27824515814",
	id = "626d239c1af5691148c5a057"
)

val clientJohn = Client(
	name = "John",
	surname = "Jackson",
	gender = "M",
	phoneNumber = "0873627365",
	clientId = "9611225083083",
	maritalStatus = "Not Married",
	id = "626d239c1af5691148c5a157"
)
val studentJohn = Student(
	name = "John",
	surname = "Jackson",
	gender = "M",
	age = 0,
	phoneNumber = "0873627365",
	studentId = "9611225083083",
	id = "626d239c1af5691148c5a757"
)

/*
* to make this work we need to Inject the ClientService, I did not add Dependency Injection Yet!
* Thinking of using Koin, however it's not stable yet!
* */
suspend fun loadingDb(clientService: ClientService) {
	clientService.addClient(client1)
	clientService.addClient(client2)
	clientService.addClient(clientJohn)
}


fun main() = application {
	Window(onCloseRequest = ::exitApplication) {
		app()
	}
}


//fun main(args: Array<String>) {
//John.addStudent("Robby", "Jackson", "M", 17, "0873627365", "9611225083083")
//println(John.getStudent("9611225083083").getName())
//println(John.getStudent("Robby", "Jackson").getAge())
//println(John.getStudent("9611225083083").setLessons(30, "2:30"))
//John.makeStudent()
//John.isStudent().setLessons(30, "4:00")

//	john.isStudent().lessonAttended(true, false, true, true, "Positive")

//}
