package day5and6

// -- Trait in Scala --
trait Employee {

  def name():Unit   // abstract method
  def department():Unit   // abstract method
}

trait Contractor {

  def name():Unit
  def site()= println("Working on onsite project")  // implemention inside trait
  def cost():Unit
}

//  -- Extending a trait --
class Details extends Employee {

  def name():Unit = println(s"My name is AYUSH")

 def department() = println(s"My department is Scala Studio")

}

// -- Extending multiple traits --
class EmployeeDetails extends Employee with  Contractor {

  def name():Unit = println(s"My name is AYUSH KUMAR TIWARI")
  def department() = println(s"My department is JAVA Studio")
  def cost()= println("Total cost is 100dollar")

}

// -- Abstract Class in Scala --
abstract  class Animal(color:String){
  def breed():Unit
  def color():Unit = println(s"Color od animal is $color")
}

//  Class extending Abstract Class
class Dog(color:String) extends Animal(color){

   def breed(): Unit = println("Breed of dog is German Shepherd")
}

object Test extends App{

  val emp = new Details

  emp.name
  emp.department

  val emp1 = new EmployeeDetails
  emp1.site
  emp1.cost

  val dog= new Dog("White")
  dog.color
  dog.breed

}