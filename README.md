# KoinMVVMCoroutine
This repository implementation of Koin architecture ,retrofit with coroutine.</br>

Following step to setup coroutines</br>
<ul>
    <li>Add coroutines dependencies</li>
    <ul>
        <li>implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.1.1'</li>
    <li>Note : It will working on Kotlin version 1.3 or better</li>
    </ul>
2)Add ViewModel dependencies for MVVM architecture</br>
    implementation 'org.koin:koin-android-viewmodel:2.0.1'</br>
3)Add Retrofit dependencies for network calling</br>
    implementation("com.squareup.okhttp3:logging-interceptor:4.2.0")</br>
    implementation "com.squareup.retrofit2:retrofit:2.6.1"</br>
    implementation "com.squareup.retrofit2:adapter-rxjava2:2.6.1"</br>

Implementations:</br>
Use CoroutineScope(Dispatchers.Main).launch = This is used for Update UI on main thread (Like AndroidSchedulers.Main)</br>
Use CoroutineScope(Dispatchers.IO).launch  = Implements operation on IO thread (Like Schedulers.io)</br>
</ul>
