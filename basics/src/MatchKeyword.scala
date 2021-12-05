

object MatchKeyword {
  def main(args: Array[String]): Unit = {
    val i = 10
    i match {
      case 1 | 3 => println("odd")
      case 2 | 10 => println("even")
//      case _ => println("donno")
    }

    val age = "20";
    age match {
      case "10" => println(age)
      case "20" => println(age)
      case _    => println("no match found")
    }
  }
}