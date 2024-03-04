// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

buildscript {
    extra.apply {
        set("kotlin_version", "1.5.31")
        set("activityVersion", "1.4.0")
        set("appCompatVersion", "1.4.0")
        set("constraintLayoutVersion", "2.1.2")
        set("coreTestingVersion", "2.1.0")
        set("coroutines", "1.5.2")
        set("lifecycleVersion", "2.4.0")
        set("materialVersion", "1.4.0")
        set("roomVersion", "2.3.0")
        // testing
        set("junitVersion", "4.13.2")
        set("espressoVersion", "3.4.0")
        set("androidxJunitVersion", "1.1.3")
    }
}
