#!/usr/bin/env bash
set -euo pipefail

root_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$root_dir/quiet-fabric-loom"

tests=(
  net.fabricmc.loom.test.integration.DeferredRunArgumentsTest
  net.fabricmc.loom.test.integration.IncludeConfigurationOverlapTest
  net.fabricmc.loom.test.integration.IncludedJarsTest
  net.fabricmc.loom.test.integration.noRemap.IncludedJarsNoRemapTest
  net.fabricmc.loom.test.integration.NestJarsApiTest
  net.fabricmc.loom.test.integration.RemapOutputConfigurationTest
  net.fabricmc.loom.test.integration.ShadowIntegrationTest
  net.fabricmc.loom.test.integration.RunClasspathFilterTest
  net.fabricmc.loom.test.unit.ArtifactMetadataTest
  net.fabricmc.loom.test.unit.ZipUtilsTest
)

args=(test)
for test in "${tests[@]}"; do
  args+=(--tests "$test")
done

exec ./gradlew "${args[@]}" "$@"
