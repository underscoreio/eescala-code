object Part2 extends App {

  trait Shape {
    def width: Double
    def height: Double
  }

  case class Rectangle(width: Double, height: Double) extends Shape

  case class Circle(radius: Double) extends Shape {
    def width  = radius * 2
    def height = radius * 2
  }

  object Area {
    def calculate(shape: Shape): Double = {
      shape match {
        case Rectangle(w, h) => w * h
        case Circle(r) => math.Pi * r * r
      }
    }
  }

  val r = Rectangle(5, 8)
  val c = Circle(10)

  println("r is " + r.width + " units by " + r.height + " units")
  println("c is " + c.width + " units by " + c.height + " units")

  println("The area of r is " + Area.calculate(r))
  println("The area of c is " + Area.calculate(c))

}