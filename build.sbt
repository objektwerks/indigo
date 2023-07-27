lazy val indigo =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin, SbtIndigo)
    .settings(
      name := "indigo",
      version := "0.0.1",
      scalaVersion := "3.3.1-RC4",
      organization := "objektwerks"
    )
    .settings(
      showCursor := true,
      title := "Indigo",
      gameAssetsDirectory := "assets",
      windowStartWidth := 720,
      windowStartHeight := 480,
      libraryDependencies ++= Seq(
        "io.indigoengine" %%% "indigo" % "0.14.0",
        "io.indigoengine" %%% "indigo-extras" % "0.14.0",
        "io.indigoengine" %%% "indigo-json-circe" % "0.14.0",
      )
    )