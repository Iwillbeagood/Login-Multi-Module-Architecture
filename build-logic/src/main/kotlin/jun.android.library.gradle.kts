import com.jun.loginCAApp.configureCoroutineAndroid
import com.jun.loginCAApp.configureHiltAndroid
import com.jun.loginCAApp.configureKotest
import com.jun.loginCAApp.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
