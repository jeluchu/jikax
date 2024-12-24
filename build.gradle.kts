plugins {
    id("maven-publish")
    kotlin("jvm") version "2.0.21"
    id("org.jetbrains.dokka") version "0.10.1"
    kotlin("plugin.serialization") version "2.0.21"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven("https://jitpack.io")
    maven("https://kotlin.bintray.com/ktor")
    maven("https://kotlin.bintray.com/kotlinx")
}

group = "com.jeluchu.jikax"
version = "0.9.3"

dependencies {
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.logger)
    testImplementation(libs.jupiter.junit.api)
    testRuntimeOnly(libs.jupiter.junit.engine)
    implementation(libs.bundles.kotlin.coroutines)
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }

    test {
        useJUnitPlatform()
    }

    dokka {
        outputFormat = "html"
        outputDirectory = "$rootDir/docs"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.jeluchu"
            artifactId = "jikax"
            version = "0.8.0"

            from(components["kotlin"])
        }
    }
}