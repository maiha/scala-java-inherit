name := "inherit protected field in scala and java"

version := "1.0"
     
scalaVersion := "2.11.2"
     
libraryDependencies ++= Seq(
  "javax.mail" % "mail" % "1.4.7",
  "org.apache.commons" % "commons-email" % "1.3.3"
)

scalacOptions ++= Seq("-feature")
