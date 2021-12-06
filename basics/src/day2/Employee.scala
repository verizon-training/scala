package day2

class Employee(override val name: String) extends User(name){
  def this(name: String, age: Int) {
    this(name)
  }
  
  override def work{
    println(s"$name is working from home")
  }
}