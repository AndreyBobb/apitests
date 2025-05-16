plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.namecompany"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.rest-assured:rest-assured:5.5.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.19.0")
    implementation("io.rest-assured:kotlin-extensions:5.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}