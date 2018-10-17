
inThisBuild(
  List(
    organization := "com.github.Poorva17.ammonite-sample",
    scalaVersion := Libs.scalaVersion,
    version := "0.1.0-SNAPSHOT",
    resolvers += "jitpack" at "https://jitpack.io",
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-feature",
      "-unchecked",
      "-deprecation",
      //"-Xfatal-warnings",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code",
      "-Xfuture",
      //      "-Xprint:typer"
    )
  )
)

lazy val `ammonite-sample` = project
  .in(file("."))
  .aggregate(
    `sample`
  )

lazy val `sample` = project
  .settings(
    libraryDependencies ++= Seq(
      Libs.`ammonite`
    )
  )