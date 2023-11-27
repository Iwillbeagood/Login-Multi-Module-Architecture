plugins {
    id("jun.android.library")
    id("kotlinx-serialization")
}

android {
    namespace = "com.jun.datastore"
}

dependencies {
    implementation(projects.core.model)
    implementation(libs.androidx.datastore)
    implementation(libs.kotlinx.serialization.json)
}