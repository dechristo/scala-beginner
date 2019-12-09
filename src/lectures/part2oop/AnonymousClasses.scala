package lectures.part2oop

object AnonymousClasses extends App{
  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahahahah")
  }
  
  /*
   Equivalent to:

   class AnonymousClasses$$anon$1 extends Animal {
     override def eat: Unit = println("hahahahahahah")
   }
   val funnyAnimal: Animal = new AnonymousClasses$$anon$1

   */

  println(funnyAnimal.getClass)
}
