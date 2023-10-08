plugins {
    id("jun.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jun.domain"
}
dependencies {
    implementation(projects.core.data)
    implementation(projects.core.model)
}
