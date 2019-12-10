package lectures.part2oop

import playground.{Cinderella => Princess, PrinceCharming}

object PackagingAndImports extends App {
  val writer = new Writer("Daniel", "RockTheJVM", 2018)
  val princes = new Princess

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

}
/**
 Notes
 1. If you don't wanna import the package, you can use the full qualified name, e.g: playground.Cinderella.
 2. Best practice is to match folder structure.
 3. Package Objects can be only one per package.
 4. Alias are used with => as done with Cinderella.
 */
