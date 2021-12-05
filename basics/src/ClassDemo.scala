import java.util.Date

class User(val name: String = null, var height: Float = 30.3F,val dob: Date) {
  def this() {
    this("Tom", 20,new Date())
  }
  def this( name: String,  height: Float) {
    this(name, height, new Date())
  }
}

object ClassDemo {
  def main(args: Array[String]): Unit = {
    var u1 = new User();
    println(u1.name) //getter
    //    u1.name = "john"
    u1.height = 4.0F //setter
    var u2 = new User("Ram", 34F, new Date());
    println(u2.name)
    println(u2.height)
       var u3 = new User("Ram", 34F, new Date());
    println(u3.dob)
  }
}