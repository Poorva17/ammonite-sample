import sbt._

object Libs {
  val scalaVersion = "2.12.7"
  val Version = "1.2.1-16-48ce533"
  val `ammonite` = "com.lihaoyi" % "ammonite" % Version cross CrossVersion.full
}
