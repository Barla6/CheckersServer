val ktor_version: String by project
val kotlin_version = "1.5.20"
val logback_version: String by project

plugins {
//    application
//    kotlin("jvm") version "1.5.20"
    id("checkers.kotlin-application-conventions")
}

//group = "com"
//version = "0.0.1"
application {
    mainClass.set("checkers.CheckersServer.ApplicationKt")
//    mainClass.set("com.ApplicationKt")
//    val isDevelopment: Boolean = project.ext.has("development")
//    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}
//
//repositories {
//    mavenCentral()
//}

dependencies {
    implementation(project(":CheckersLib"))
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}