plugins {
    base
    kotlin("jvm") version "1.5.21" apply false
}

allprojects {
    group = "com.rockpell"
    version = "1.0-SNAPSHOT"
    repositories {
        mavenCentral()
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}