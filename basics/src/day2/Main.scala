package day2

object Main {
  def main(args: Array[String]): Unit = {
    val service = new UserServiceImpl
    service.search
    
    
    val e1: User = new Employee("John");
    e1.work

    //    User u1 = new User
    val u1 = new User("Ram")
    println(u1.name)
    u1.work(1.2F)
    u1.work
  }
}