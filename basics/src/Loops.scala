

object Loops {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 3, 4, 5, 5)
    val filteredNumbers = for (i <- numbers; if i < 5) yield {
      println(i)
      i
    }
    println(s"filtered values=$filteredNumbers")
        for(i <- 1.to(5)){
          println(i)
        }
    //    println("---------------")
    //    for(i <- 1 until 6){
    //      println(i)
    //    }
  }
}