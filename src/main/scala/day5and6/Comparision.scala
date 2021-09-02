package day5and6

import scala.language.postfixOps


class Person(val name: String, val age: Int) extends Ordered[Person]{

  def compare(that:Person) = {

    if((this.name == that.name) || (this.name.length == that.name.length)){
      val res = this.age - that.age
      if(res==0){
        0
      } else if(res<0){
        -1
      }else{1}
    }
    else{
      if(this.name.length>that.name.length){
        1
      }else{-1}
    }

  }
}

object Comparision extends  App{
  val person1 = new Person("Ayush", 23)
  val person2 = new Person("Ayush",25)
  println(person1<person2)

  val person3 = new Person("Ayush", 23)
  val person4 = new Person("Akash", 24)
  println(person3>person4)

}

