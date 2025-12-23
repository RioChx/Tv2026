plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.cyber.widget"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.cyber.widget"
        minSdk = 24
        targetSdk = 33
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.core:core-splashscreen:1.0.0")
}