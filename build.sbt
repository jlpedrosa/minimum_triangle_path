name := "minimum_triangle_path"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

testOptions in Test += Tests.Argument("-oF")