import net.minecrell.gitpatcher.PatchExtension

plugins {
  id("net.minecraftforge.gitpatcher") version "0.10.+"
}

configure<PatchExtension> {
  submodule = "fabric-loom"
  target = file("patched-loom")
  patches = file("patches")
}

tasks.register("rebuildPatches") {
  dependsOn(tasks.named("makePatches"))
}
