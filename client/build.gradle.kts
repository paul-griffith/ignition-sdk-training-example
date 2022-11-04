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
    implementation("com.inductiveautomation.ignitionsdk", "client-api", ignitionSdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "designer-api", ignitionSdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "vision-designer-api", ignitionSdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "vision-client-api", ignitionSdkVersion)
}
