package lectures.part2oop

class Inheritance extends App{
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("momnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog extends Animal {
    override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("woof crunch woof")
    }
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  // overriding vs overloading

  // super
}

/**
 * NOTES
 *
 * 1. You can override fields directly in the constructor: class Dog(val creatureType: String) extends Animal
 * 2. Prevent overrides with keyword final or sealed
 * 3. Sealed vs Final: sealed you can inherit in the same file and prevent it on another files.
 */
