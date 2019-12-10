package lectures.part3fp

object AnonymousFunctions extends App{

  // lambda
  val doubler: Int => Int = x => x * 2
  // or
  val doubler2 = (x: Int) => x * 2

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a, b) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) //function itself
  println(justDoSomething()) //call

  // curly braces with lambdas
  val stringToInt = {(str: String) => str.toInt }

  // MOAR syntatic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ //equivalent to (a,b) => a + b

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
