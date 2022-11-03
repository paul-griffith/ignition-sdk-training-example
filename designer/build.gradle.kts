dependencies {
    implementation(projects.client)
    implementation(projects.common)
    compileOnly("com.inductiveautomation.ignitionsdk:ignition-common:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:client-api:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:designer-api:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:vision-designer-api:8.1.0")
}
