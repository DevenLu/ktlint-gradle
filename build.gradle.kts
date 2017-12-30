buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:+")
    }
}
plugins {
    kotlin(module = "jvm", version = "1.2.0") apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

task<Wrapper>("wrapper") {
    gradleVersion = "4.2"
    distributionType = Wrapper.DistributionType.ALL
}
