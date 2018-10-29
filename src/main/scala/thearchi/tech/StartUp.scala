import thearchi.tech.TriangleParser

import io.Source.stdin

 object StartUp extends App {

   def run(args: Array[String]): Unit = {

    val triangle = TriangleParser.parseString(stdin.getLines)

   }
}
