package day2

abstract class Notification
case class Email (sender:String, title:String, body:String ="") extends Notification
case class SMS (sender:String, title:String) extends Notification
case class Voice (sender:String, title:String, body:String) extends Notification
object MatcherWIthCasClass {
  
  def main(args: Array[String]): Unit = {
    def showNotification(notification : Notification):String = {
      println(notification)
      notification match {
        case Email(sender, title, _) => 
          s"you have got email "
        case SMS(sender, title) => 
          s"you have got EMS"
        case Voice(sender, title, _) => 
          s"you have got voice message"
      }
    }
    
    val sms1 = SMS("983838383", "Are you fine")
    val email = Email("983838383", "Are you fine")
    println(showNotification(sms1))
    println(showNotification(email))
    
  }
}