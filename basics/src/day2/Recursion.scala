package day2

import scala.annotation.tailrec

object Recursion {
  def fact(n: Int): Int = {
    if (n == 1) 1
    else n * fact(n - 1)
  }

  //  def fact(n: Int): Int = {
  //    @tailrec def innerRecursion(acc: Int, n: Int): Int = {
  //      if (n <= 1) acc
  //      else innerRecursion(n * acc, n - 1)
  //    }
  //    innerRecursion(1, n)
  //  }
  def main(args: Array[String]): Unit = {
    println(fact(9))
  }
}