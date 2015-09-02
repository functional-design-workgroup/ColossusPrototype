lazy val root = (project in file(".")).
  settings(
    name := "ColossusPrototype",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.5",
    assemblyJarName := "colossus-prototype.jar",
    mainClass in assembly := Some("org.awesome.colossus.ColossusPrototype")
  )

libraryDependencies ++= {
  Seq(
    "com.tumblr" %% "colossus" % "0.6.4"
  )
}
