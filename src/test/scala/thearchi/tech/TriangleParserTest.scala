package thearchi.tech

import org.scalatest.FunSuite


class TriangleParserTest extends FunSuite {

  test("Empty string")
  {
    val emptyTriangleStr = "";
    val emptyTriangleArrExpected = Array();
    val emptyTriangleArrActual = TriangleParser.parseString(emptyTriangleStr.linesIterator)
    assert(emptyTriangleArrActual === emptyTriangleArrExpected)
  }

  test("One Level tree no new line")
  {
    val singleLineTriangleStr = "1";
    val singleLineTriangleExpected = Array(Array(1));
    val singleLineTriangleActual = TriangleParser.parseString(singleLineTriangleStr.linesIterator)
    assert(singleLineTriangleActual === singleLineTriangleExpected)
  }

  test("One Level tree new line")
  {
    val singleLineTriangleStr = "1\n";
    val singleLineTriangleExpected = Array( Array(1));
    val singleLineTriangleActual = TriangleParser.parseString(singleLineTriangleStr.linesIterator)
    assert(singleLineTriangleActual === singleLineTriangleExpected)
  }

  test("Two Level tree new line")
  {
    val singleLineTriangleStr = "1\n2 3\n";
    val singleLineTriangleExpected = Array(Array(1), Array(2,3));
    val singleLineTriangleActual = TriangleParser.parseString(singleLineTriangleStr.linesIterator)
    assert(singleLineTriangleActual === singleLineTriangleExpected)
  }

  test("Two Level tree no final new line")
  {
    val singleLineTriangleStr = "1\n2 3";
    val singleLineTriangleExpected = Array(Array(1), Array(2,3));
    val singleLineTriangleActual = TriangleParser.parseString(singleLineTriangleStr.linesIterator)
    assert(singleLineTriangleActual === singleLineTriangleExpected)
  }

  test("Sample triangle test") {
    val sampleTriangleStr = "7\n6 3\n3 8 5\n11 2 10 9";
    val sampleTriangleStrArrExpected =  Array(
      Array(7),
      Array(6,3),
      Array(3,8,5),
      Array(11,2,10,9)
    );

    val emptyTriangleArrActual = TriangleParser.parseString(sampleTriangleStr.linesIterator)
    assert(emptyTriangleArrActual === sampleTriangleStrArrExpected)
  }
}


