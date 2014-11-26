object Part4 extends App {

  trait FindResult
  case class Found(value: Int) extends FindResult
  case object NotFound extends FindResult

  trait IntList {
    def findGreater(target: Int): FindResult = {
      this match {
        case Empty => NotFound
        case Cell(h, t) =>
          if(h >= target) {
            Found(h)
          } else {
            t.findGreater(target)
          }
      }
    }

    def findGreater2(target: Int): FindResult
  }

  case object Empty extends IntList {
    def findGreater2(target: Int) = NotFound
  }

  case class Cell(head: Int, tail: IntList) extends IntList {
     def findGreater2(target: Int) = {
      if(head >= target) {
        Found(head)
      } else {
        tail.findGreater(target)
      }
    }
  }

  val a: IntList = Cell(1, Cell(2, Cell(3, Empty)))
  val b: IntList = Empty

  println("The first number >= 2 in a is " + a.findGreater(2))
  println("The first number >= 2 in b is " + b.findGreater(2))

}
