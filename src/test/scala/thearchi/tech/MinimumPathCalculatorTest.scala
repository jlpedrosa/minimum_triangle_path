package thearchi.tech

import org.scalatest.FunSuite

class MinimumPathCalculatorTest extends FunSuite {


  test("No triangle")
  {
    TestATriangle(Array(), 0)
  }


  test("One Level tree")
  {
    TestATriangle(Array(Array(1)), 1)
  }

  test("Sample triangle test") {
    val sampleTriangleStrArrExpected = Array(
      Array(7),
      Array(6, 3),
      Array(3, 8, 5),
      Array(11, 2, 10, 9)
    );
    TestATriangle(sampleTriangleStrArrExpected, 18)
  }


    def TestATriangle(triangle: Array[Array[Int]], expectedWeitght : Int)  =
    {
      val triangleArrActual = MinimumPathCalculator.Calculate(triangle)
      assert(triangleArrActual.weight === expectedWeitght)
    }

}


