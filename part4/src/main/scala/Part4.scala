object Part4 extends App {

  trait FindResult
  case class Found(value: Int) extends FindResult
  case object NotFound extends FindResult

  trait IntList {
    def findGt(target: Int): FindResult = {
      this match {
        case Empty => NotFound
        case Cell(h, t) =>
          if(h >= target) {
            Found(h)
          } else {
            t.findGt(target)
          }
      }
    }

    def findGt2(target: Int): FindResult
  }

  case object Empty extends IntList {
    def findGt2(target: Int) = NotFound
  }

  case class Cell(head: Int, tail: IntList) extends IntList {
     def findGt2(target: Int) = {
      if(head >= target) {
        Found(head)
      } else {
        tail.findGt(target)
      }
    }
  }

  val a: IntList = Cell(1, Cell(2, Cell(3, Empty)))
  val b: IntList = Empty

  println("The first number >= 2 in a is " + a.findGt(2))
  println("The first number >= 2 in b is " + b.findGt(2))

}
