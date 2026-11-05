plugins { id("buildlogic.java-conventions") }

java { disableAutoTargetJvm() }

tasks.withType<JavaCompile>().configureEach { options.release.set(8) }

dependencies {
  implementation(libs.junit.junit)
  implementation(libs.org.slf4j.slf4j.api)
  // versions follow `plugin.version.surefire` in `parent/pom.xml`; `build-tools/pom.xml` pins the
  // same versions inline, which Renovate updates together with the plugin
  implementation(libs.org.apache.maven.surefire.surefire.myextensions.api)
  implementation(libs.org.apache.maven.surefire.maven.surefire.common)
}

description = "Zeebe Build Tools"
