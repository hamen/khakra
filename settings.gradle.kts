import de.fayard.refreshVersions.*

buildscript {
  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
  dependencies {
    classpath("de.fayard.refreshVersions:refreshVersions:0.9.7")
  }
}

bootstrapRefreshVersions()

rootProject.name = "khakra"
include("lib", "externals", "sandbox")
