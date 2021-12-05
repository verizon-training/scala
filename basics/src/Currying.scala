
//technique of transforming a function that takes many arguments into a function that takes a single argument
object Currying {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int) = x + y
    def add2(x: Int) = {
       (y: Int) => x + y //closure
    }

    println(add(1, 2))
//    val closureFucntion = add2(40)
//    println(closureFucntion(3))
    println(add2(40)(3))
  }
}