plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}

dependencies {
    implementation(projects.common)

    val ignitionSdkVersion = libs.versions.ignition.get()
    implementation("com.inductiveautomation.ignitionsdk", "gateway-api", ignitionSdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "driver-api", ignitionSdkVersion)
}
