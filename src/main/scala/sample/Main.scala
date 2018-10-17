package sample

import ammonite.util.Res

object Main {

  def main(args: Array[String]): Unit = {

    val (result: Res[Any], paths) = ammonite
      .Main(
        predefCode = """
                       |import scala.concurrent.duration.Duration
                       |println("#######################")
                       | """.stripMargin
      ).run()

    println(paths)
    println(result.asInstanceOf[Res.Exception].t.printStackTrace())
  }
}
