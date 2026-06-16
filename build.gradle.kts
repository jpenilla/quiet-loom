plugins {
  id("ca.stellardrift.gitpatcher") version "2.0.0"
}

gitPatcher.patchedRepos {
  register("fabricLoom") {
    submodule = "upstreams/fabric-loom"
    target = file("quiet-fabric-loom")
    patches = file("patches/fabric-loom")
  }
}
