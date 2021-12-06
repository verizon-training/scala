package day2

class User(val name: String) {
  def this(name: String, age: Int) {
    this(name)
  }
  def work {
    println(s"$name is working")
//    Math.add
  }
  def work(duration:Float) {
    println(s"$name is working for $duration hours")
  }
}