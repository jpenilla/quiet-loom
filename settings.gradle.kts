if (file("patched-loom").exists()) {
  includeBuild("patched-loom")
}

rootProject.name = "quiet-loom"
