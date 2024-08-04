lazy val indigo = (project in file("."))
  .enablePlugins(ScalaJSPlugin, SbtIndigo)
  .settings(
    name := "indigo",
    version := "0.1-SNAPSHOT",
    scalaVersion := "3.5.0-RC6",
    organization := "objektwerks"
  )
  .settings(
    title := "Game",
    gameAssetsDirectory := "assets",
    windowStartWidth := 720,
    windowStartHeight := 480,
    showCursor := true,
    libraryDependencies ++= {
      val indigoVersion = "0.16.0"
      Seq(
        "io.indigoengine" %%% "indigo" % indigoVersion,
        "io.indigoengine" %%% "indigo-extras" % indigoVersion,
        "io.indigoengine" %%% "indigo-json-circe" % indigoVersion,
      )
    }
  )
scalacOptions ++= Seq(
  "-Wunused:all"
)
