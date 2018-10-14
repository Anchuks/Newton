scalaVersion := "2.12.7"

libraryDependencies += "org.scastie" %% "runtime-scala" % "0.27.0+88e31358dbdcc1933f3cf7766701a8cf27102880"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked"
)
