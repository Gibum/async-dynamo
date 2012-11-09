organization := "asyncdynamo"

name := "async-dynamo"

scalaVersion := "2.9.2"

// Libraries
libraryDependencies ++= Seq(
    "com.amazonaws" % "aws-java-sdk" % "1.3.5",
    "com.typesafe.akka" % "akka-actor" % "2.0"
)

// Test libraries
libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.6.1" % "test",
    "log4j" % "log4j" % "1.2.17" % "test"
)
