pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        jcenter()
        }
}

rootProject.name = "Pokemon_FV"
include(":app")
 