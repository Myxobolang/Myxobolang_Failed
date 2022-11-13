plugins {
    kotlin("multiplatform")
}

group = "xyz.chlamydomonos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply {
        binaries {
            staticLib(listOf(RELEASE))
            sharedLib(listOf(DEBUG))
        }
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation(project(":CommonLexer"))
            }
        }
        val nativeTest by getting
    }
}
