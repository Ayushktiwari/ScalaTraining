// 1- By using main method

object Basics {

  def main(args: Array[String]): Unit = {
    val fname = "Ayush" // here type is optional ex- val fname: String = "Ayush" b/c scala can infer the type
    val mname = "Kumar" // here type is optional ex- val mname: String = "Kumar"
    val lname = "Tiwari" // here type is optional ex- val lname: String = "Tiwari"

    // 2- Merging multiple string
    val name1 = fname + " " + mname + " " + lname
    println(name1)

    // 3- appending by using s and $ symbol  -->  STRING INTERPOLATION
    val name2 = s"$fname $mname $lname"
    println(name2)

    val name3 = s"Name is : $fname $mname $lname"
    println(name3)

    // 4- Multiple line String
    val str =
      """My name is Ayush,
        |I'm a scala developer
        |and I work in Knoldus""".stripMargin

    println(str)

    // 5- Reading input in scala

    println("Enter your first name")
    val firstname = scala.io.StdIn.readLine()

    println("Enter your last name")
    val lastname = scala.io.StdIn.readLine()

    println(s"Your name is : $firstname $lastname")


    // 6- var and val

    val a = 10 // this is immutable we can not change the value of it.
    println("Value of a is: " + a)

    /** a= 15
     *  println("New value of a is: "+a)   --> error b/c val cannot be changed
     */

    var b = 10 // this is mutable we can change the value of it.

    b = 15
    println("Value of b is: " + b)
  }
}


