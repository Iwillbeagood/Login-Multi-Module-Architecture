import com.jun.loginCAApp.configureHiltAndroid
import com.jun.loginCAApp.configureKotestAndroid
import com.jun.loginCAApp.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()
