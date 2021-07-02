import ru.sergo.gradle.tasks.MsgPrintTask;

plugins {
    java
    kotlin("jvm") version ("1.5.10")
}

val junitVersion : String by project

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks {

    register("msgPrint", MsgPrintTask::class) {
        dependsOn("test")
        message = "msgPrint task message"
    }

    register("runTest", JavaExec::class) {
        dependsOn("msgPrint")
        mainClass.set("ru.sergo.learning.gradle.IntegrationTest")
        classpath = sourceSets["test"].runtimeClasspath
    }

    check {
        dependsOn("runTest")
    }
}

tasks.test {
    testLogging.showStandardStreams = true
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:${junitVersion}")
}