package lectures.part2oop

object AbstractDataTypes extends App{

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit  = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "Croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I am a croc and I am eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  /**
   * Notes
   *
   * 1. override keyword is optional when overriding abstract methods, properties.
   * 2. Traits vs Abstract: traits cannot have constructor parameters.
   * 3. Multiple traits are possible to inherit, classes not.
   * 4. traits are behaviour whilst abstract class is a type of a thing.
   */
}
