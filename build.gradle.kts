val alexaAskKTXVersion: String by project

allprojects {
    group = "hunterchung"
    version = alexaAskKTXVersion
}

plugins {
    val kotlinVersion = "1.3.20"
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm").version(kotlinVersion)
    id("io.gitlab.arturbosch.detekt").version("1.0.0-RC12")
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.amazon.alexa:ask-sdk:2.7.1")
    implementation("com.github.kittinunf.fuel:fuel:1.15.1")


    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.0.0-RC12")
}
