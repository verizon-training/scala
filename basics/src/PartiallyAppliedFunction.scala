import java.util.HashMap


object PartiallyAppliedFunction {
  def add(a: Int, b: Int, c: Int) = {
    a + b + c
  }
  def main(args: Array[String]): Unit = {
    println(add(2, 3, 4)) //fully applied
    val paf = add(  _: Int,2, 3);
    println(paf(30))
    
  }
}