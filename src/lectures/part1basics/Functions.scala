package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // When you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
  Exercises
  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2. Factorial function: 1 * 2 * 3 * 4 * ... * n
  3. A Fibonacci function
       f(1) = 1
       f(2) = 1
       f(n) = f(n-1) + f(n-2)
  4. Tests is a number is prime.
  */


  def greet(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
  println(greet("Joe", 10))

  def factorial(value: Int): Int = {
    if (value == 1) 1
    else value * factorial(value-1)
  }
  println(factorial(5))

  def fibonacci(term: Int): Int = {
    if (term <= 2) 1
    else fibonacci(term-1) + fibonacci(term - 2)
  }
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(10004))

  /**
   * Notes
   * 1. Parameterless functions can be called only with the name, without ().
   * 2. Functions return types can also be inferred by the compiler, unless it is a recursive function.
   */
}
