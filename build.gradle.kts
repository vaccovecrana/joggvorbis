plugins { id("io.vacco.common-build") version "0.5.3" }

group = "io.vacco.joggvorbis"
version = "1.3.1"

configure<io.vacco.common.CbPluginProfileExtension> {
  addJ8Spec()
  addGoogleJavaFormat()
  addClasspathHell()
  setPublishingUrlTransform { repo -> "${repo.url}/${project.name}" }
  sharedLibrary()
}
