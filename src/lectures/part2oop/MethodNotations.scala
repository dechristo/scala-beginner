package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(catchyPhrase: String): Person = new Person(s"${name} ($catchyPhrase)", favoriteMovie)
    def unary_! : String  = "Bang!"
    def unary_+ : Person  = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Yo, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnScala = this learns "Scala"
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

  /*
  Exercises
  1. Overload the + operator: mary + "the rockstar" => new person "Mary (the rockstar) and same favorite movie"
  2. Add an age to the Person class
     Add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer
  3. Add a learns() method in the Person class => "Mary learns Scala"
     Add a learnScala() method, call learns method with "Scala".
     Use it in postfix notation.
  4. Overload the apply method.
     mary.apply(2) = > "Mary watched inception 2 times"
   */

  // 1.
  println((mary + "the saint").apply)

  // 2.
  println((+mary).age)

  // 3.
  println(mary learnScala)

  // 4.
  println(mary(4))
}
