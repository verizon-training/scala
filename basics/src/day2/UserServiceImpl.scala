package day2

class UserServiceImpl extends UserService with Trait2 with Trait3 {
  override val url: String = "http://blah"
  def search: Unit = {
    println("search")
  }

  override def save: Unit = {
    field1 = 20
//    field2 = true
    println(s"UserServiceImpl  $url $field1")
  }

}