pluginManagement {
  repositories {
    gradlePluginPortal()
    maven("https://files.minecraftforge.net/maven/")
  }
}

if (file("patched-loom").exists()) {
  includeBuild("patched-loom")
}

rootProject.name = "quiet-loom"
