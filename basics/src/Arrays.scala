
object Arrays {
  def main(args: Array[String]): Unit = {
    //    (1, 2, 3, 4, 6); //tuple
    val numbers = Array(1, 2, 3, 4, 6);
    //    display(numbers);
    val sorted = numbers.sortWith(_<_)
    display(sorted)

    def display(arr: Array[Int]): Unit = {
      for (x <- arr)
        println(x)
    }

    val arr1 = new Array[Int](5)
    //    println(arr1(2))
    arr1(2) = 30
    for (value <- arr1) {
      //      arr1(i) = i
      //      value = 5
      //      println(value)
    }
  }
}