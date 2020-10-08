
name := "java-sizeof"

organization:="com.madhukaraphatak"

version:="0.1"


libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"

// pgpSecretRing := file("/home/madhu/scalapgpkeys/phatak-dev-privatekey.asc")

// pgpPublicRing := file("/home/madhu/scalapgpkeys/phatak-dev-publickey.asc")

publishMavenStyle := true

publishArtifact in Test := false

pomExtra := (
  <url>https://github.com/phatak-dev/java-sizeof</url>
  <licenses>
    <license>
      <name>Apache 2.0</name>
      <url>https://github.com/phatak-dev/java-sizeof/blob/master/LICENSE.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:phatak-dev/java-sizeof.git</url>
    <connection>scm:git:git@github.com:phatak-dev/java-sizeof.git</connection>
  </scm>
  <developers>
    <developer>
      <id>phatak-dev</id>
      <name>Madhukara phatak</name>
      <url>http://www.madhukaraphatak.com</url>
    </developer>
  </developers>)









