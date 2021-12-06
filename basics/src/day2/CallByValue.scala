package day2

object CallByValue {
  def main(args: Array[String]): Unit = {
    def counter(i: => Int){
      print(i)
      print(i)
      print(i)
    }
    var total = 0;
    counter{
      total += 1
      total
    }
  }
}