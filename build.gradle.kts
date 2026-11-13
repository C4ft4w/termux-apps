buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        val androidGradlePluginVersion = project.property("androidGradlePluginVersion") as String
        classpath("com.android.tools.build:gradle:$androidGradlePluginVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
