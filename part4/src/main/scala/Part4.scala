object Part4 extends App {

  trait FindResult
  // etc...



  trait IntList {
    // def findGreater(target: Int): FindResult
  }
  case object Empty extends IntList
  case class Cell(head: Int, tail: IntList) extends IntList










  // Tests for exercise 1
  // --------------------

  // val a: IntList = Cell(1, Cell(2, Cell(3, Empty)))
  // val b: IntList = Empty

  // println("The first number >= 2 in a is " + a.findGreater(2))
  // println("The first number >= 2 in b is " + b.findGreater(2))

}
