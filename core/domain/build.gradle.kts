plugins {
    id("jun.android.library")
}

android {
    namespace = "com.jun.domain"
}
dependencies {
    implementation(projects.core.data)
    implementation(projects.core.model)
}
