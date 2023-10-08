plugins {
    id("jun.android.library")
    id("jun.android.hilt")
    id("jun.android.room")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jun.database"
}
dependencies {
    implementation(projects.core.model)
}
