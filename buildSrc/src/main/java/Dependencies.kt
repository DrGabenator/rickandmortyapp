object Dependencies {
    object Kotlin {
        const val stdlib =
            "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin}"
    }

    object Layout {
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val materialDesign =
            "com.google.android.material:material:${Versions.material}"
    }

    object Network {
        const val retrofit =
            "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson =
            "com.squareup.retrofit2:converter-gson:${Versions.gson}"
        const val picasso =
            "com.squareup.picasso:picasso:${Versions.picasso}"
    }

    object DependencyInjection {
        const val koinCore =
            "io.insert-koin:koin-core:${Versions.koin}"
        const val koinTest =
            "io.insert-koin:koin-test:${Versions.koin}"
        const val koinAndroid =
            "io.insert-koin:koin-android:${Versions.koin}"
    }

    object Test {
        const val junit =
            "junit:junit:${Versions.junit}"
        const val extJunit =
            "androidx.test.ext:junit:${Versions.extJunit}"
        const val espresso =
            "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object View {
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"
        const val fragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    }

    object Core {
        const val appCompat =
            "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val appCompatResources =
            "androidx.appcompat:appcompat-resources:${Versions.appCompat}"
    }
}