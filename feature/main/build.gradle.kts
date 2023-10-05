plugins {
    id("jun.android.feature")
}

android {
    namespace = "com.jun.main"
}

dependencies {
    implementation(projects.feature.signin)
    implementation(projects.feature.login)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.lifecycle.viewModelCompose)
    implementation(libs.kotlinx.immutable)
}