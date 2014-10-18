object Part5 extends App {

  // Exercise 1
  // ----------

  val pythagoras = (a: Int, b: Int) =>
    math.sqrt(a*a + b*b)

  println(pythagoras(3, 4))

  // Exercise 2
  // ----------

  trait IntList {
    def filter(f: Int => Boolean): IntList = this match {
      case Cell(h, t) => if(f(h)) Cell(h, t.filter(f)) else t.filter(f)
      case Empty      => Empty
    }

    def map(f: Int => Int): IntList = this match {
      case Cell(h, t) => Cell(f(h), t.map(f))
      case Empty      => Empty
    }
  }

  case class Cell(head: Int, tail: IntList) extends IntList
  case object Empty extends IntList

  val a: IntList = Cell(1, Cell(2, Cell(3, Empty)))
  val b: IntList = Empty

  println("even numbers in a are " + a.filter(a => a % 2 == 0))
  println("odd numbers in b are " + a.filter(b => b % 2 == 1))

  println("doubled numbers from a are " + a.map(a => a * 2))
  println("doubled numbers from b are " + a.map(b => b * 2))

}