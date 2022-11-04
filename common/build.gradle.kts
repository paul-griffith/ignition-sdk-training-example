plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}

dependencies {
    val ignitionSdkVersion = libs.versions.ignition.get()
    implementation("com.inductiveautomation.ignitionsdk", "ignition-common", ignitionSdkVersion)
}
