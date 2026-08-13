plugins {
    id("com.android.application")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.rhoward.hoots_and_reps"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.rhoward.hoots_and_reps"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    // Workout cards use the Cast session's message channel rather than the
    // media player, so the native sender framework is the only dependency.
    implementation("com.google.android.gms:play-services-cast-framework:22.3.1")
    implementation("androidx.appcompat:appcompat:1.7.1")
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

flutter {
    source = "../.."
}

// Never package the retired four-day phase by mistake. The reviewed program
// has five sessions for each of 12 weeks, and its snapshot is the build input.
tasks.named("preBuild") {
    doFirst {
        val snapshot = file("../../assets/data/published_program_snapshot_v1.json")
        val workoutCount = Regex("\\\"sequence\\\"\\s*:\\s*\\d+")
            .findAll(snapshot.readText())
            .count()
        check(workoutCount == 60) {
            "Refusing to build: expected the reviewed 60-workout five-day phase, found $workoutCount workouts."
        }
    }
}
