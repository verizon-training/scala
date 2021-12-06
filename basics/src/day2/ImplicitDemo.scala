package day2

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    println(math1)
    val result = math1.add("Ram", "Kumar")
    print(result)
  }
  implicit val math1 = new Math1[String] {
    def add(x: String, y: String): String = x concat y
  }
  
}

