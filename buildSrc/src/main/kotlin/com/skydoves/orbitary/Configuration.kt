package com.skydoves.orbitary

object Configuration {
  const val compileSdk = 33
  const val targetSdk = 33
  const val minSdk = 21
  const val majorVersion = 0
  const val minorVersion = 1
  const val patchVersion = 2
  const val versionName = "$majorVersion.$minorVersion.$patchVersion"
  const val versionCode = 3
  const val snapshotVersionName = "$majorVersion.$minorVersion.${patchVersion + 1}-SNAPSHOT"
  const val artifactGroup = "com.github.skydoves"
}
