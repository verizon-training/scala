package day2

trait UserService {
  val url: String //abstract field
  var field1 = 10 //concrete field
  val field2 = true
  def save {
    print("saved")
  }
  def search //abstract method
}