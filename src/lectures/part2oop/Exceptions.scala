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
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a Runtime Exception")
  }
  finally {
    println("I will always be printed, until the end of time.")
  }

  try {
    getInt(true)
  } catch {
    case e: NullPointerException => println("Caught a Runtime Exception")
  }
  finally {
    println("I will always be printed, until the end of time.")
  }

  /**
   * Notes
   *
   * 1. Exceptions: something goes wrong with the program. Errors: something goes wrong with the system.
   */
}
