plugins {
  id("net.minecrell.gitpatcher") version "0.9.0"
}

patches {
  submodule = "fabric-loom"
  target = file("patched-loom")
  patches = file("patches")
}

tasks.register("rebuildPatches") {
  dependsOn(tasks.makePatches)
}
