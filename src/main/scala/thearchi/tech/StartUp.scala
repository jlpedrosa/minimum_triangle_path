import thearchi.tech.{MinimumPathCalculator, TriangleParser}

import io.Source.stdin

 object StartUp extends App {

   def run(args: Array[String]): Unit = {

     val triangle = TriangleParser.parseString(stdin.getLines)
     var shortestPath = MinimumPathCalculator.Calculate(triangle)
     println(s"Minimal path is: ${shortestPath.pathString} = ${shortestPath.weight}")

   }
}
