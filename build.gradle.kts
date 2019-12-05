plugins {
    kotlin("jvm") version "1.3.61"
}

group = "fail.swagger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
}


tasks {
    register("getHomeDir")  {
        doLast{
            println(gradle.gradleHomeDir)
        }
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}