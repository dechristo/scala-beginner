package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  //== != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects
  println(aVariable)

  //Instructions (Do) vs Expressions (Have value)

  //If Expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while(i < 10) {
    println(i)
    i += 1
  }

  //Repeat with me: never write loops in Scala again =)

  //EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //Exercises:
  // 1. difference between "hello world" vs println("hello world") ?
  // A:The first one is a string literal (type string) the second is an expression which is a side effect (type Unit)

  // 2.

  val someValue = {
    2 < 3
  }

  //A:  true

  val someAnotherValue = {
    if(someValue) 239 else 986
    42
  }

  //A: 42

  /**
   * Notes
   * 1. Everything in Scala is an expression.
   * 2. Code block is an expression.
   * 3. The value of a block is the value of its last expression.
   * 4. What is defined within a code block is not visible outside.
   * 5. Don't use loops in scala.
   */
}
