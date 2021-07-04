plugins {
    kotlin("jvm") version "1.5.20"
}

group = "tw.b2e"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
}
