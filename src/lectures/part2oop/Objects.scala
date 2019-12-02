package lectures.part2oop

object Objects extends  App{

  object Person {
    // class-level (static) functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def from(mother: Person, father: Person): Person = new Person("bobbie")
    def apply(mother: Person, father: Person): Person = new Person("bobbie")
  }

  class Person(val name: String) {
    // instance-level functionality
  }

  // companions

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = Person
  val john = Person
  println( mary == john)

  val mary2 = new Person("Mary")
  val john2 = new Person("John")
  println( mary2 == john2)

  val bobbie = Person.from(mary2, john2)
  val bobbie2 = Person(mary2, john2)

  // Scala Applications


}

/**
 * NOTES
 *
 * 1. Scala does not have class level functionality (static)
 * 2. Scala object is a singleton instance
 * 3. Scala applications are a scala object with def main(args: Array[String]): Unit
 * */
