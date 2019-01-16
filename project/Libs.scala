import sbt._

object Libs {
  val scalaVersion = "2.12.8"
  val Version = "1.6.0"
  val `ammonite` = "com.lihaoyi" % "ammonite" % Version cross CrossVersion.full
}
