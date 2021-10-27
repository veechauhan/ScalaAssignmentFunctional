package edu.KUP

trait Function2[A, B, C] {
  def apply(x: A, y: B): C
}

class Add {
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(x: Int, y: Int): Int = x + y
  }
}


