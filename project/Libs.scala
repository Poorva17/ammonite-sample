import sbt._

object Libs {
  val Version = "1.2.1-16-48ce533"
  val `ammonite` = "com.lihaoyi" % "ammonite" % Version cross CrossVersion.full
}
