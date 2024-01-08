import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    id("org.springframework.boot") version "2.6.4" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
    id("org.jlleitschuh.gradle.ktlint-idea") version "11.5.1"

    kotlin("jvm") version "1.6.21" apply false
    kotlin("plugin.spring") version "1.5.21" apply false
    kotlin("plugin.jpa") version "1.5.21" apply false
}

allprojects {
    group = "com.rockpell"
    version = "1.0-SNAPSHOT"
}

ext {
    set("springCloudVersion", "2021.0.1")
    set("mockitoKotlinVersion", "4.0.0")
}

allprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        maven { url = uri("https://jitpack.io") }
    }
}

subprojects {
//    repositories {
//        mavenCentral()
//        maven { url = uri("https://repo.spring.io/milestone") }
//        maven { url = uri("https://repo.spring.io/snapshot") }
//        maven { url = uri("https://jitpack.io") }
//    }

    tasks.withType<Test> {
        systemProperty("spring.profiles.active", "test")
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}
