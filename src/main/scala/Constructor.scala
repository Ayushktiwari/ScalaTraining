
//  -- Primary Constructor --
class Constructor(var name:String, var age:Int){

  var id:Int = 0

  def display(): Unit ={
    println(s"Name is $name and age is $age and id is $id")
  }

  //  -- Auxillary Constructor --
  def this(name:String, age:Int, id:Int){
    this(name,age)
    this.id= id
  }



}
object Constructor {

  def main(args:Array[String]): Unit ={
    val p1 = new Constructor("Ayush",23)
    val p2 = new Constructor("Ayush", 23, 34)
    p1.display()
    p2.display()
    println("First adding two number then double --> " +addAndMultiply(5,5.5))
  }

  //  -- Scala Methods --
  def addAndMultiply(a:Int,b:Double):Double={
    val sum = a+b
    val double = sum*2
    return  double
  }


}
