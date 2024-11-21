plugins {
    kotlin("jvm") version "2.0.21"
    application  // Adiciona o plugin de aplicação
}

group = "org.example"
version = "1.0-rc1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("org.example.MainKt")  // Define a classe principal para execução
}

tasks.jar {
    archiveBaseName.set("ohmslaw")
    archiveVersion.set("1.0-rc1")
}

tasks.test {
    useJUnitPlatform()
}
