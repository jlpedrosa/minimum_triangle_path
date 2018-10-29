package thearchi.tech

case class TrianglePath (weight : Int, nodes : List[Int])
{
   def pathString() : String = nodes.mkString(" + ")

}

object MinimumPathCalculator
{
  def Calculate(triangle : Array[Array[Int]]) : TrianglePath = {

    println("Length" + triangle.length)

    if (triangle.length <= 1) {
      val theFlatTriange = triangle.flatten.toList
      return TrianglePath(theFlatTriange.sum,  theFlatTriange)
    }


    val firstRow = Array.fill[TrianglePath](triangle.last.length + 1)(TrianglePath(0, List()))

    def subTriangles(upperLevel: Array[Int], lowerLevel: Array[TrianglePath]): Array[TrianglePath] = {
      val lowerNodes = lowerLevel.zip(lowerLevel.tail)
      val subTriangles = upperLevel.zip(lowerNodes)

      subTriangles.map {
        case (upperNode, (leftNode, rightNode)) => {
          val nextNode =
            if (leftNode.weight < rightNode.weight) leftNode else rightNode

          TrianglePath(
            upperNode + nextNode.weight,
            upperNode :: nextNode.nodes)
        }
      }
    }

    triangle.
      foldRight(firstRow)(subTriangles).
      head
  }
}