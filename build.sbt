name := """play-101"""
organization := "com.ibm"
maintainer := "roridedi@redhat.com"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies += guice
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)
import com.typesafe.sbt.packager.docker.DockerChmodType
dockerChmodType := DockerChmodType.UserGroupWriteExecute
javaOptions in Universal ++= Seq(
  "-Dpidfile.path=/dev/null"
)