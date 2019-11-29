package lectures.part1basics

object DefaultArgs extends App{

  def factorialTailRecursive(n: Int, acc: Int = 1): Int = {
    if (n == 1) acc
    else factorialTailRecursive(n -1, n * acc)
  }

 // println(factorialTailRecursive(10))
  val factorialOf10 = factorialTailRecursive(10, 2)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture...")
  savePicture(width = 3360, height = 4890)

  /*
   1. pass in every leading argument, later arguments are implied by the compiler
   2. name the arguments
   */

  savePicture(height = 800, format="bmp")
}
