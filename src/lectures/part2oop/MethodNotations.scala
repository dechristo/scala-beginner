package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String  = "Bang!"
    def isAlive: Boolean = true
    def apply(): String = s"Yo, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") ///infix or operator notation

  // operators in Scala
  val tom = new Person("Tom", "Friday the 13th part 3")
  println(mary hangOutWith tom)

  println(1 + 2)
  println(1.+(2))

  // all operators are methods.

  // prefix notation
  val x = -1
  val y = 1.unary_-
  //unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)
  
  //apply
  println(mary.apply())
  println(mary())
}
