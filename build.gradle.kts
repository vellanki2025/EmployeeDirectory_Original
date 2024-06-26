// Top-level build file where you can add configuration options common to all sub-projects/modules.

// navigation args
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version "2.50" apply false

    // database
    id("com.google.devtools.ksp") version "1.9.0-1.0.12" apply false
}