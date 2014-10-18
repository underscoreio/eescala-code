object Part3 extends App {

  trait IntList
  case object Empty extends IntList
  case class Cell(head: Int, tail: IntList) extends IntList










  // Tests for exercise 1
  // --------------------

  // val a: IntList = Cell(1, Cell(2, Cell(3, Empty))
  // val b: IntList = Empty

  // println("The length of a is " + a.length)
  // println("The length of b is " + b.length)

  // println("The length2 of a is " + a.length2)
  // println("The length2 of b is " + b.length2)

  // println("The sum of a is " + a.sum)
  // println("The sum of b is " + b.sum)

}