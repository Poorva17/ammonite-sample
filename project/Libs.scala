import sbt._

object Libs {
  val scalaVersion = "2.12.7"
  val Version = "1.3.2"
  val `ammonite` = "com.lihaoyi" % "ammonite" % Version cross CrossVersion.full
}
