name := "play-pac4j-java-demo"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  "org.pac4j" % "play-pac4j_java" % "1.2.0-SNAPSHOT",
  "org.pac4j" % "pac4j-core" % "1.5.0-SNAPSHOT",
  "org.pac4j" % "pac4j-http" % "1.5.0-SNAPSHOT",
  "org.pac4j" % "pac4j-cas" % "1.5.0-SNAPSHOT",
  "org.pac4j" % "pac4j-openid" % "1.5.0-SNAPSHOT",
  "org.pac4j" % "pac4j-oauth" % "1.5.0-SNAPSHOT"
)

resolvers ++= Seq(
    "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

play.Project.playJavaSettings

