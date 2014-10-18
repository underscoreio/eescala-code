scalaVersion := "2.11.2"

lazy val part1 = project.in(file("./part1"))

lazy val part2 = project.in(file("./part2"))

lazy val part3 = project.in(file("./part3"))

lazy val part4 = project.in(file("./part4"))

lazy val part5 = project.in(file("./part5"))

lazy val part6 = project.in(file("./part6"))

lazy val root = project.in(file(".")).aggregate(
  part1,
  part2,
  part3,
  part4,
  part5,
  part6
)
