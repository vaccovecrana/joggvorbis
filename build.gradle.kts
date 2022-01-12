plugins { id("io.vacco.oss.gitflow") version "0.9.8" }

group = "io.vacco.joggvorbis"
version = "1.3.1"

configure<io.vacco.oss.gitflow.GsPluginProfileExtension> {
  addJ8Spec()
  addClasspathHell()
  sharedLibrary(true, false)
}

configure<io.vacco.cphell.ChPluginExtension> {
  resourceExclusions.add("module-info.class")
}

configure<JavaPluginExtension> {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}
