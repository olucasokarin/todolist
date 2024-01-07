name := """back"""
organization := "org.olucas"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
libraryDependencies += "org.jooq" % "jooq-scala_2.13" % "3.18.7"
libraryDependencies += "org.jooq" % "jooq-meta" % "3.19.1"
libraryDependencies += "org.jooq" % "jooq-codegen" % "3.19.1"
libraryDependencies += "org.postgresql" % "postgresql" % "42.7.1"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.olucas.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.olucas.binders._"
