

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello scala")
    var name = "Ram" //string pool
//    name = 10;
    println(name)
    val age =10.1F //final , immutable, implicit inference
//    age =20
    println(age)
    val name1 = name
    println(name1.charAt(0))
    println(name+ " is "+age+" years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%f years old")
       println(raw"Hello \nscala")
      var salary: Int =10
      
  }
}