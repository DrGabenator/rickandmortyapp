plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = AppConfig.compileSdkVersion
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.stdlib)

    implementation(Dependencies.DependencyInjection.koinAndroid)
    implementation(Dependencies.DependencyInjection.koinCore)
    implementation(Dependencies.DependencyInjection.koinTest)

    implementation(Dependencies.Core.appCompat)
    implementation(Dependencies.Core.appCompatResources)

    implementation(Dependencies.Layout.constraintLayout)
    implementation(Dependencies.Layout.materialDesign)

    implementation(Dependencies.Network.gson)
    implementation(Dependencies.Network.picasso)
    implementation(Dependencies.Network.retrofit)

    implementation(Dependencies.View.liveData)
    implementation(Dependencies.View.viewModel)
    implementation(Dependencies.View.fragment)
    implementation(Dependencies.View.ui)

    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.extJunit)
}