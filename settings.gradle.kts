pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "loginCAApp"
include(
    ":app",

    ":core:data",
    ":core:database",
    ":core:datastore",
    ":core:designsystem",
    ":core:domain",
    ":core:model",

    ":feature:main",
    ":feature:login",
    ":feature:signin",
    ":feature:home"
)
