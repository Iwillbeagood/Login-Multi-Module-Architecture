plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "jun.android.hilt"
            implementationClass = "com.jun.loginCAApp.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "jun.kotlin.hilt"
            implementationClass = "com.jun.loginCAApp.HiltKotlinPlugin"
        }
        register("androidRoom") {
            id = "jun.android.room"
            implementationClass = "com.jun.loginCAApp.AndroidRoomPlugin"
        }
    }
}
