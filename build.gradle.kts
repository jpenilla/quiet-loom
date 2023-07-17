plugins {
  id("ca.stellardrift.gitpatcher") version "1.0.0"
}

patches {
  submodule.set("fabric-loom")
  target.set(file("patched-loom"))
  patches.set(file("patches"))
}

tasks.register("rebuildPatches") {
  dependsOn(tasks.makePatches)
}
