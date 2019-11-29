package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{
  def factorial(n: Int): Int =
    if (n == 1) 1
    else {
      println("Computing factorial of " + n + " - I first need a factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

   println(factorial(10))
  // println(factorial(5000)) //crashes with stack overflow

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x == 1) accumulator
      else factorialHelper(x - 1, x * accumulator) //Tail Recursion = use recursive call as the LAST expression
    }
    factorialHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factorialHelper(10, 1)
    = factorialHelper(9, 10 * 1)
    = factorialHelper(8, 9 * 10 * 1)
    = factorialHelper(7, 8 * 9 * 10 * 1)
    = ...
    = factorialHelper(2, 3 * 4 * ... * 10 * 1)
    = factorialHelper(1, 2 * 3 * 4 * ... * 10 * 1)
    = 1 * 2 * 3 * 4 * ... * 10
   */

  println(anotherFactorial(5000))

  /*
  Exercises
  1. Concatenate a string n times with tail recursion
  2. IsPrime() with tail recursion
  3. Fibonacci with tail recursion
   */

  // 1.

  def concatenate(str: String, nTimes: Int) : String = {
    if (nTimes == 1) str
    else str + concatenate(str, nTimes - 1)
  }

  println(concatenate("yo", 5))

  @tailrec
  def concatenateWithTailRecursion(str: String, nTimes: Int, accumulator: String) : String = {
      if (nTimes == 0) accumulator
      else concatenateWithTailRecursion(str, nTimes - 1, accumulator + str)
    }

  println(concatenateWithTailRecursion("yo", 5, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeWithTailRecursion(t: Int, isStillPrime: Boolean): Boolean = {
      if (! isStillPrime) false
      else if (t == 1) true
      else isPrimeWithTailRecursion(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeWithTailRecursion(n / 2, true)
  }

  println(isPrime(3011))
  println(isPrime(289))

  def fibonacci(n: Int): Int = {
    def fibonacciTailRecursion(i: Int, previous: Int, secondPrevious: Int): Int = {
      if ( i >= n) previous
      else fibonacciTailRecursion(i + 1, previous + secondPrevious, previous)
    }
    if (n <= 2) 1
    else fibonacciTailRecursion(2, 1, 1)
  }

  println(fibonacci(8))

  /**
   * Notes
   * 1. When you need LOOPS, use Tail Recursion.
   */
}
