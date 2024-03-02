plugins {
  id("ca.stellardrift.gitpatcher") version "1.1.0"
}

gitPatcher.patchedRepos {
  register("fabricLoom") {
    submodule = "upstreams/fabric-loom"
    target = file("quiet-fabric-loom")
    patches = file("patches/fabric-loom")
  }
  register("architecturyLoom") {
    submodule = "upstreams/architectury-loom"
    target = file("quiet-architectury-loom")
    patches = file("patches/architectury-loom")
  }
}
