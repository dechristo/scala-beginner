package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false;
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 1
  val aLong: Long = 238764238643247232L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5 //side effects

  /**
  Notes
    1. Vals are IMMUTABLE.
    2. Types are optional, they can be inferred by the compiler.
    3. Semicolons are only mandatory for multiple expressions in the same line.
   */
}
