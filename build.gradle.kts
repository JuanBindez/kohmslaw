plugins {
    kotlin("jvm") version "2.0.21"
    application
    `maven-publish`  // Adicionando o plugin Maven para publicação
}

group = "org.example"
version = "1.0-rc5"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

application {
    mainClass.set("org.example.MainKt")
}

tasks.jar {
    archiveBaseName.set("ohmslaw")
    archiveVersion.set("1.0-rc5")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.JuanBindez:kohmslaw:1.o-rc5")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")
        }
    }
}
