package thearchi.tech

import org.scalatest.FunSuite


class TrianglePathTest extends FunSuite {

  test("Print a trail")
  {
      val aPath = TrianglePath(12, List(0,1,2,3))
      assert(aPath.pathString() === "0 + 1 + 2 + 3")
  }

  test("Print an empty trail")
  {
    val aPath = TrianglePath(0, List())
    assert(aPath.pathString() === "")
  }
}
