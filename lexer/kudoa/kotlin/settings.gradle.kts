include("CommonLexer")
rootProject.name = "KudoaLexer"
project(":CommonLexer").projectDir = File("../../common")
pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.multiplatform") version "1.6.10"
    }
}