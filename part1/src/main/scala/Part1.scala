object Part1 extends App {

  case class Cat(color: String, favoriteFood: String) {
    def eat(food: String): String = {
      if(food == favoriteFood) "OMNOM" else "Blehhh"
    }
  }

  val oswald    = Cat("black", "milk")
  val henderson = Cat("ginger and white", "chips")
  val quentin   = Cat("tabby and white", "curry")

  object ChipShop {
    def serves(cat: Cat): Boolean = {
      cat.favoriteFood == "chips"
    }
  }

  println("oswald "    + ChipShop.serves(oswald))
  println("henderson " + ChipShop.serves(henderson))
  println("quentin "   + ChipShop.serves(quentin))

}
