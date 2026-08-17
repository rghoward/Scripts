plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.rhoward.hoots_and_reps.wear"
    compileSdk = 36

    defaultConfig {
        // Phone and watch must use the same application ID and signing key for
        // the private Wear OS Data Layer channel.
        applicationId = "com.rhoward.hoots_and_reps"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

dependencies {
    // Health Services owns the sensor configuration and active-exercise state
    // on Wear OS. Keep this module native; the phone app remains Flutter.
    implementation("androidx.health:health-services-client:1.1.0-rc02")
    // Health Services exposes async APIs as ListenableFuture values.
    implementation("com.google.guava:guava:33.4.0-android")
    implementation("com.google.android.gms:play-services-wearable:20.0.1")
}
