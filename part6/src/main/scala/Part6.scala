object Part6 extends App {

  trait IntList
  case class Cell(head: Int, tail: IntList) extends IntList
  case object Empty extends IntList










  // Tests for exercise 1
  // --------------------

  // val a: LinkedList[Int]    = Cell(1, Cell(2, Cell(3, Empty()))
  // val b: LinkedList[String] = Cell("foo", Cell("bar", Cell("baz", Empty()))

  // println("a's head is 1 " + (a.head == 1))
  // println("b's head is 'baz' " + (b.head == "baz"))
  // println("a's head is 'baz' " + (a.head == "baz"))

  // Tests for first optional exercise
  // ---------------------------------

  // println("a contains 3 " + a.contains(1))
  // println("b contains 'baz' " + b.contains("baz"))
  // println("a contains 'baz' " + a.contains("baz"))

  // println("a index of 3 " + a.indexOf(1))
  // println("b reverse " + b.reverse)

  // Tests for exercise 2
  // --------------------

  // println("a halved " + a.map(number => number / 2.0))
  // println("b uppercased " + b.map(str => str.toUpperCase))

  // Tests for second optional exercise
  // ----------------------------------

  // val c = Cell(1, Cell(2, Empty())) append Cell(3, Empty())
  // val d = c.map(num => Cell(num * 10, Cell(num, Empty())))

  // println("c " + c) // should be 1, 2, 3
  // println("d " + d) // should be 10, 1, 20, 2, 30, 3

}