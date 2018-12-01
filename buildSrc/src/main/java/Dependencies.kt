object Versions {
    const val kotlin = "1.3.10"
    const val kotlinCoroutines = "1.0.1"
    const val retrofit = "2.5.0"
    const val moshi = "1.8.0"
    const val room = "2.0.0"
    const val lifecycle = "2.0.0"
}

@Suppress("UNUSED")
object Libs {
    // kotlin
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"

    // network
    const val okhttp3 = "com.squareup.okhttp3:okhttp:3.12.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"

    // appcompat
    const val appcompat = "androidx.appcompat:appcompat:1.0.2"

    // androidx
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val pagingRuntime = "androidx.paging:paging-runtime:2.0.0"

    // view
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.0.0"
    const val material = "androidx.material:material:1.0.0"
}

@Suppress("UNUSED")
object KaptLibs {
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
}

@Suppress("UNUSED")
object TestLibs {
    const val junit = "junit:junit:4.12"
    const val testRunner = "androidx.test:runner:1.1.0"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.1.0"
}