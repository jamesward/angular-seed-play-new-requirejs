name := """angular-seed-play"""

version := "1.0-SNAPSHOT"

resolvers += "Local Maven" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  //"org.webjars" %% "webjars-play" % "2.2.1-1-SNAPSHOT",
  //"org.webjars" % "angularjs" % "1.2.9",
  "org.webjars" % "requirejs" % "2.1.10"
  //"org.webjars" % "requirejs-text" % "2.0.10"
)     

play.Project.playScalaSettings
