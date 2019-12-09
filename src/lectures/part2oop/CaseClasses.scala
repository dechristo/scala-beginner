package lectures.part2oop

object CaseClasses extends App{

  /*
  equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. Class parameters are promoted to fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. Sensible toString
  println(jim.toString) // = println(jim)

  // 3. Equals and hashCode implemented out of the box
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. CCs have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. CCs are serializable
  //akka

  // 7. CCs have extractor patterns: can ne used in patter matching

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}

/**
 Notes
 1. println(instance) = println(instance.toString)
 2. Don't use new when instantiating case classes
 3. Companion Objects are like static methods (class) in Java
 **/