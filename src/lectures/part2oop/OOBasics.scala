package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Luke", 64)
  println(person.x)
  person.greet("Leia")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
}

// constructor
class Person(name: String, val age:Int = 0) {
  // body
  val x = 2

  println(x + 1)

  // method
  def greet (name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("No one")
}

/*
Exercises
1. Novel and Writer
  1.1. Writer:
       - attributes: first name, surname, year
       - methods: fullname
  1.2. Novel
      - attributes: name, year of release, author
      - methods: authorAge, isWritten(author), copy(new year of release) = new instance of Novel.

2. Counter Class
  - receive an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dec to receive an amount
 */

class Writer (val firstName: String, val surname: String, val year: Int) {
  def getFullName(): String = firstName + " " + surname
}

class Novel(val name: String, val releaseYear: Int, author: Writer) {
  def authorAge(): Int = releaseYear - author.year
  def isWrittenBy(author: Writer) = author.getFullName() == this.author.getFullName()
  def copy(newReleaseYear: Int) = {
    var newNovel = new Novel(this.name, newReleaseYear, this.author)
    newNovel
  }
}

class Counter(counter: Int) {
  def increase() = {
    println("incrementing...")
    new Counter(counter + 1)
  }
  def decrease() = {
    println("decrementing...")
    new Counter(counter - 1)
  }
  def increase(increaseBy: Int): Counter = {
   if (increaseBy <= 0) this
    else increase.increase(increaseBy - 1)
  }
  def decrease(decreaseBy: Int) : Counter = {
    if (decreaseBy <= 0) this
    else decrease.decrease(decreaseBy - 1)
  }
  def print = println(counter)
}

/**
 Notes
 1. Class parameters are not fields.
 2. Values/Variables declared inside class definition(constructor) body are public.
 3. Changing only the return type it not overloadin.
 */
