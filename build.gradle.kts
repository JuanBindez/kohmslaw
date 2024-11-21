plugins {
    kotlin("jvm") version "2.0.21"
    application
    `maven-publish`
}

group = "com.JuanBindez.kohmslaw"
version = "v1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

publishing {
    publications {
        create<MavenPublication>("Maven") {
            from(components["kotlin"])
        }
    }
}