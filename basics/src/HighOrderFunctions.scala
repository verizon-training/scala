

object HighOrderFunctions {
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def main(args: Array[String]): Unit = {
    math(2, 3, (x, y) => x * y)  //template design pattern
    
  }
}