import net.minecrell.gitpatcher.PatchExtension

buildscript {
  dependencies {
    classpath("net.minecraftforge:gitpatcher") {
      version {
        branch = "master"
      }
    }
  }
}

apply(plugin = "net.minecraftforge.gitpatcher")

configure<PatchExtension> {
  submodule = "fabric-loom"
  target = file("patched-loom")
  patches = file("patches")
}

tasks.register("rebuildPatches") {
  dependsOn(tasks.named("makePatches"))
}
