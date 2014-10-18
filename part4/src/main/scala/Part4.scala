object Part4 extends App {

  trait Result
  case class Finite(value: Int) extends Result
  case object Undefined extends Result

  trait Calculation {
    def calculate: Result
  }

  case class Addition(a: Calculation, b: Calculation) extends Calculation {
    def calculate = (a.calculate, b.calculate) match {
      case (Finite(a), Finite(b)) => Finite(a + b)
      case _                      => Undefined
    }
  }

  case class Multiplication(a: Calculation, b: Calculation) extends Calculation {
    def calculate = (a.calculate, b.calculate) match {
      case (Finite(a), Finite(b)) => Finite(a * b)
      case _                      => Undefined
    }
  }

  case class Division(a: Calculation, b: Calculation) extends Calculation {
    def calculate = (a.calculate, b.calculate) match {
      case (_,         Finite(0)) => Undefined
      case (Finite(a), Finite(b)) => Finite(a / b)
      case _                      => Undefined
    }
  }

  case class Number(value: Int) extends Calculation {
    def calculate = Finite(value)
  }

  val a = Addition(Number(1), Multiplication(Number(2), Number(3)))
  val b = Division(Number(1), Number(0))

  println("a is " + a.calculate)
  println("b is " + b.calculate)

}
