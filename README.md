# KoinMVVMCoroutine
This repository implementation of Koin architecture ,retrofit with coroutine.

Following step to setup coroutines

1)Add coroutines dependencies
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.1.1'
    Note : It will working on Kotlin version 1.3 or better
2)Add ViewModel dependencies for MVVM architecture
    implementation 'org.koin:koin-android-viewmodel:2.0.1'
3)Add Retrofit dependencies for network calling
    implementation("com.squareup.okhttp3:logging-interceptor:4.2.0")
    implementation "com.squareup.retrofit2:retrofit:2.6.1"
    implementation "com.squareup.retrofit2:adapter-rxjava2:2.6.1"

Implementations:
Use CoroutineScope(Dispatchers.Main).launch = This is used for Update UI on main thread (Like AndroidSchedulers.Main)
Use CoroutineScope(Dispatchers.IO).launch  = Implements operation on IO thread (Like Schedulers.io)
