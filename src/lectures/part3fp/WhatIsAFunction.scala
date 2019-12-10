package lectures.part3fp

object WhatIsAFunction extends App{

  // dream: use functions as first class elements
  // problem: oop

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  trait MyFunction[A,B] {
    def apply(element: A):B
  }

  println(doubler(2))

  // function types = FunctionN[1,..,N]
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder = new ((Int, Int) => Int) {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  /*
    Exercises

    1. A function which takes 2 strings and concatenates them.
    2. Transform the MyPredicate and MyTransformer into function types.
   */

  // 2.
  def concatenator: (String, String) => String = (v1: String, v2: String) => v1 + v2

  println(concatenator("Yo", " there!"))

  /**
   * Notes
   *
   * 1. Function types Function2[A, B, R] === (A,B) => R
   * 2. All Scala functions are objects.
   */
}
