plugins {
    id("com.android.application")
    id ("maven-publish")
}

android {
    namespace = "com.noman.sdk2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.noman.sdk2"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.0")
    implementation("com.google.android.material:material:1.5.0-alpha02")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation("com.github.nmnfaisal:SDK2:1.0.3")
    implementation(project(mapOf("path" to ":toaster")))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}