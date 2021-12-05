

object Closures {
  var number1 = 10;
  val outerAdd = (x: Int) => {
    println(x, number1)
  }
  def main(args: Array[String]): Unit = {
    val number1 = 20;
    val add = (x: Int) => {
//      number1 = 21;
      println(x, number1)
    }
    add(12)
    outerAdd(5)
  }
}