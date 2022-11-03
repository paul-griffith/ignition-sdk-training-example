plugins {
    id("io.ia.sdk.modl") version "0.1.1"
}

version = "1.0.0-SNAPSHOT"

subprojects {
    version = rootProject.version

    apply<JavaLibraryPlugin>()

    repositories {
        // enable resolving dependencies from the inductive automation artifact repository
        maven(url = "https://nexus.inductiveautomation.com/repository/public")
        mavenCentral()
    }
}

ignitionModule {
    name.set("Ignition SDK Example")
    fileName.set("Ignition-SDK-example.modl")
    id.set("com.inductiveautomation.training.example")
    moduleVersion.set("${project.version}")
    moduleDescription.set("A sample project companion piece for Inductive Automation's SDK training.")
    requiredIgnitionVersion.set("8.1.0")

    projectScopes.putAll(
        mapOf(
            ":common" to "GDC",
            ":client" to "C",
            ":designer" to "D",
            ":gateway" to "G"
        )
    )

    hooks.putAll(
        mapOf(
            "com.inductiveautomation.ignition.examples.training.GatewayHook" to "G",
            "com.inductiveautomation.ignition.examples.training.designer.DesignerHook" to "D",
            "com.inductiveautomation.ignition.examples.training.client.ClientHook" to "C"
        )
    )

    skipModlSigning.set(true)
}
