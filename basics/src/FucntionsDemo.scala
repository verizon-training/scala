

object FucntionsDemo {
  //  def add(x: Int, y: Int): Int = {
  //    print(x)
  //    return x + y
  //  }

  object Math {
    def add(x: Int, y: Int = 15): Int = x + y
    def +(x: Int, y: Int = 15): Int = {//operator overloading
      println("short")
      x + y + 1
    }
  }

  val myadd = (x: Int, y: Int) => {//anonymous function
	  x + y
  }
  def main(args: Array[String]): Unit = {
    //    println(Math.add(1))
    println(Math.+(1))
//    val add1 = Math.add//
    val myadd1 = myadd
    val age: Int = 10 + 20
    println(age)
  }
}