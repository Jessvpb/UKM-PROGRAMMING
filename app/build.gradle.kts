plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.roomwordsample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.roomwordsample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //val composeVersion = rootProject.extra["compose_version"]
    implementation ("androidx.appcompat:appcompat:$rootProject.appCompatVersion")
    implementation ("androidx.activity:activity-ktx:$rootProject.activityVersion")

    // Dependencies for working with Architecture components
    // You'll probably have to update the version numbers in build.gradle (Project)

    // Room components
    implementation ("androidx.room:room-ktx:$rootProject.roomVersion")
    implementation("androidx.room:room-common:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-android:2.8.0-alpha02")
    implementation("androidx.lifecycle:lifecycle-livedata-core-ktx:2.7.0")
    kapt ("androidx.room:room-compiler:$rootProject.roomVersion")
    androidTestImplementation ("androidx.room:room-testing:$rootProject.roomVersion")

    // Lifecycle components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$rootProject.lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$rootProject.lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-common-java8:$rootProject.lifecycleVersion")

    // Kotlin components
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$1.1.4")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$rootProject.coroutines")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$rootProject.coroutines")

    // UI
    implementation ("androidx.constraintlayout:constraintlayout:$rootProject.constraintLayoutVersion")
    implementation ("com.google.android.material:material:$rootProject.materialVersion")

    // Testing
    testImplementation ("junit:junit:$rootProject.junitVersion")
    androidTestImplementation ("androidx.arch.core:core-testing:$rootProject.coreTestingVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:${rootProject.ext["espressoVersion"]}")
    androidTestImplementation ("androidx.test.ext:junit:$rootProject.androidxJunitVersion")
}