package thearchi.tech

import org.scalatest.FunSuite


class TriangleParserTest extends FunSuite {

  test("Parse empty string")
  {
    TestATriangle("", Array())
  }

  test("Parse One Level tree no new line")
  {
    TestATriangle("1", Array(Array(1)))
  }

  test("Parse One Level tree new line")
  {
    TestATriangle("1\n", Array( Array(1)))
  }

  test("Parse Two Level tree new line")
  {
    TestATriangle("1\n2 3\n",Array(Array(1), Array(2,3)))
  }

  test("Parse Two Level tree no final new line")
  {
    TestATriangle("1\n2 3", Array(Array(1), Array(2,3)))
  }

  test("Parse Sample triangle test") {
    val sampleTriangleStrArrExpected = Array(
      Array(7),
      Array(6, 3),
      Array(3, 8, 5),
      Array(11, 2, 10, 9)
    );
    TestATriangle("7\n6 3\n3 8 5\n11 2 10 9", sampleTriangleStrArrExpected)
  }


    def TestATriangle(triangleStr : String,  expectedTriangle: Array[Array[Int]])  =
    {
      val triangleArrActual = TriangleParser.parseString(triangleStr.linesIterator)
      assert(triangleArrActual === expectedTriangle)
    }

}


