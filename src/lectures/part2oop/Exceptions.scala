package lectures.part2oop

object Exceptions extends App{
  val x: String = null
  // println(x.length)
  // this ^ crashes with a NPE.
  // throwing and catching exceptions

  // 1. throwing exceptions

  // val aWeirdValue: String = throw new NullPointerException

  // throwable classes extends the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. How to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if(withExceptions) throw new RuntimeException("No int for you, dude!")
    else 444

  try {
    getInt(false)
  } catch {
    case e: RuntimeException => println("Caught a Runtime Exception")
  }
  finally {
    println("I will always be printed, until the end of time.")
  }

  val potentialFail = try {
    getInt(false)
  } catch {
    case e: NullPointerException => println("Caught a Runtime Exception")
  }
  finally {
    println("I will always be printed, until the end of time.")
  }

  class MyException extends Exception
  val exception = new MyException

  // throw exception

  /*
   1. Crash your program with an OutOfMemory
   2. Crash with Stack Overflow error
   3. PocketCalculator
      - add(x,y)
      - subtract(x,y)
      - multiply(x,y)
      - divide(x,y)

      Throw
        - OverflowException if add(x,y) exceeds Int.MAX_VALUE.
        - UnderflowException if subtract(x,y) exceeds Int.MIN_VALUE.
        - MathCalculationException for division by 0.
   */

  // OOM
  // val array = Array.ofDim(Int.MaxValue)

  // SO
  // def infinite: Int = 1 + infinite
  //  val noLimit = infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends  RuntimeException
  class PocketCalculatorException extends RuntimeException("DivisionByZero")

  object PocketCalculator extends RuntimeException{
    def add(x: Int, y:Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int): Int = {
      if (y == 0) throw new PocketCalculatorException
      else x /y
    }
  }

  // println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(2, 0))



  /**
   * Notes
   *
   * 1. Exceptions: something goes wrong with the program. Errors: something goes wrong with the system.
   * 2. Use Finally only for side effects
   */
}
