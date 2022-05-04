import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
	kotlin("multiplatform") version "1.6.10"
	id("org.jetbrains.compose")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
	google()
	mavenCentral()
	maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
	jvm {
		compilations.all {
			kotlinOptions.jvmTarget = "11"

		}
		withJava()
	}
	sourceSets {
		val jvmMain by getting {
			dependencies {
				implementation(compose.desktop.currentOs)
				api(compose.runtime)
				api(compose.foundation)
				api(compose.material)
				api(compose.ui)
				api(compose.materialIconsExtended)
				api(compose.uiTooling)
				implementation("org.litote.kmongo:kmongo:4.5.1")
				implementation("org.litote.kmongo:kmongo-coroutine:4.5.1")
			}
		}
		val jvmTest by getting
	}
}

compose.desktop {
	application {
		mainClass = "MainKt"
		nativeDistributions {
			targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
			packageName = "Student_Management_System"
			packageVersion = "1.0.0"
		}
	}
}