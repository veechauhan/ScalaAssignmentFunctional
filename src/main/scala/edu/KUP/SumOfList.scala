package edu.KUP

trait Function1[A, B] {
  def apply(list: A): B
}

class SumOfList {
  val list: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }

}
