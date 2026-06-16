maybeIncludeBuild("quiet-fabric-loom")
fun maybeIncludeBuild(path: String) {
  if (file(path).exists()) {
    includeBuild(path)
  }
}

rootProject.name = "quiet-loom-parent"
