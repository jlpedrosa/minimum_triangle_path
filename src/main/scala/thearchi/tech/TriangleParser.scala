package thearchi.tech

object TriangleParser {

  def parse(s: String) = s.trim.split("\\s+").map(_.toInt)
  def parseString(args: Iterator[String]) = args.map(parse).toArray

}
