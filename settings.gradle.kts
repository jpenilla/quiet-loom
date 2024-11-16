maybeIncludeBuild("quiet-fabric-loom")
// maybeIncludeBuild("quiet-architectury-loom")

fun maybeIncludeBuild(path: String) {
  if (file(path).exists()) {
    includeBuild(path)
  }
}

rootProject.name = "quiet-loom-parent"
