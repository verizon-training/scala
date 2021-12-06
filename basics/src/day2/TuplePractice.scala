package day2

object TuplePractice {
  def main(args: Array[String]): Unit = {
    val user = (15, "Chan", true) //immutable
    //    user._1 = 20
    print(user._1)
    var (id, name, gender) = user
    println(name)
    //iterate
    user.productIterator.foreach { item => println(item) }
  }
}