package day2

case class Book(isbn:String)
object CaseClass {
  def main(args: Array[String]): Unit = {
    val book1 = Book("978-349449")
    val book2 = Book("978-349449")
    print(book1.isbn)
    println(book1.hashCode() == book2.hashCode())
    val result = book1 == book2
    //copy
    val copiedBook = book1.copy(isbn = book1.isbn)
    println(book1.hashCode() == copiedBook.hashCode())
//    print(result)
//    book1.isbn = "3840242"
  }
}