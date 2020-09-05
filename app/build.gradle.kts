plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")

    defaultConfig {
        applicationId = "codes.malukimuthusi.gadsleaderboard"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                "proguard-android-optimize.txt",
                "proguard-rules.pro"
            )
        }
    }
}

object PluginVersions {
    const val ESPRESSO = "3.3.0"
    const val CORE_KTX = "1.3.1"
    const val AppCmpact = "1.2.0"
    const val ConstraintLayout = "2.0.1"
    const val JUNIT = "4.12"
    const val JUNIT_EXT = "1.1.2"
    const val KOTLIN_V = "1.4.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
    implementation("androidx.core:core-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")
    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

}