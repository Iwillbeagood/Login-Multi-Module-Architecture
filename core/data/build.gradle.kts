plugins {
    id("jun.android.library")
    id("jun.android.hilt")
    id("jun.kotlin.hilt")
}

android {
    namespace = "com.jun.data"
}
dependencies {
    implementation(projects.core.model)
    implementation(projects.core.database)
}
