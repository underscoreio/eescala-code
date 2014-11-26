scalaVersion := "2.11.2"

lazy val commonSettings = Seq(
  retrieveManaged := true
)

lazy val part1 = project.in(file("./part1")).settings(commonSettings : _*)

lazy val part2 = project.in(file("./part2")).settings(commonSettings : _*)

lazy val part3 = project.in(file("./part3")).settings(commonSettings : _*)

lazy val part4 = project.in(file("./part4")).settings(commonSettings : _*)

lazy val part5 = project.in(file("./part5")).settings(commonSettings : _*)

lazy val part6 = project.in(file("./part6")).settings(commonSettings : _*)

lazy val root = project.in(file(".")).aggregate(
  part1,
  part2,
  part3,
  part4,
  part5,
  part6
)
