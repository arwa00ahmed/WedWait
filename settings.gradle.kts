pluginManagement {
    repositories {
<<<<<<< HEAD
        google()
=======
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
>>>>>>> teammate/main
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
<<<<<<< HEAD
    }
}

rootProject.name = "WedWaitApp"
=======
        maven {setUrl("https://jitpack.io")}
    }
}

rootProject.name = "My Application2"
>>>>>>> teammate/main
include(":app")
 