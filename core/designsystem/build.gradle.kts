plugins {
    id("jun.android.library")
    id("jun.android.compose")
}

android {
    namespace = "com.jun.designsystem"
}

dependencies {
    implementation(libs.androidx.appcompat)
}