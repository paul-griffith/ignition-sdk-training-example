enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ignition-sdk-training-example"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://nexus.inductiveautomation.com/repository/public")
    }
}

include(
    ":common",
    ":client",
    ":designer",
    ":designer-launcher",
    ":gateway"
)
