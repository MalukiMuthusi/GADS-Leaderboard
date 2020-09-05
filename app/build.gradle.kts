import Build_gradle.PluginVersions.activity_version
import Build_gradle.PluginVersions.fragment_version
import Build_gradle.PluginVersions.nav_version

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

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
    const val LIFECYCLE = "2.2.0"
    const val ARCH = "2.1.0"
    const val fragment_version = "1.2.5"
    const val activity_version = "1.1.0"
    const val nav_version = "2.3.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
    implementation("androidx.core:core-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")
    implementation("com.google.android.material:material:1.2.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${PluginVersions.LIFECYCLE}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${PluginVersions.LIFECYCLE}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:${PluginVersions.LIFECYCLE}")
    implementation("androidx.fragment:fragment-ktx:$fragment_version")
    implementation("androidx.activity:activity-ktx:$activity_version")
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

}