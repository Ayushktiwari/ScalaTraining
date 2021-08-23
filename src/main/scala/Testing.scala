import scala.util.control.Breaks._

object Testing {

  def add(a: Int, b: Int): Int = { a+b }
  def subtract(a: Int, b: Int): Int = { a-b }
  def multiply(a: Int, b: Int): Int = { a*b }
  def divide(a: Int, b: Int): Int = {
    if (b == 0) {
      println("denominator cann't be zero")
    }
    a / b
  }

  def power(a: Int, b: Int): Double={ scala.math.pow(a,b).intValue()}
  def absolute(a: Int) = { (a).abs }
  def modulus(a: Int, b: Int): Int = { (a % b) }
  def max(a: Int, b: Int): Int = { if (a > b) a else b }
  def min(a: Int, b: Int): Int = { if (a > b) b else a }



  //  def main(args: Array[String]): Unit ={
  //
  //    println("Adding the given number and result is == "+add(10,20))
  //    println("Subtracting the given number and result is == "+subtract(10,20))
  //    println("Multiplying the given number and result is == "+multiply(10,20))
  //    println("Dividing the given number and result is == "+divide(10,20))
  //    println("Power of the given number is == "+power(11,3))
  //    println("Absolute value of the given number is == "+absolute(-10))
  //    println("Modulus of the given number is == "+modulus(40,20))
  //    println("Maximun the given number is == "+max(40,20))
  //    println("Minimum the given number is == "+min(10,20))
  //
  //
  //
  //  }

  def main(args: Array[String]) {
    var ch: Char = 0
    var num1: Int = 0
    var num2: Int = 0
    var result = 0


    print("Choose operation to perform (+,-,*,/,%,|,>,<): ")
    breakable {
      while (true) {
        ch = scala.io.StdIn.readChar()

        if (ch == 'q') break()
        if (ch == '|') {
          print("Enter number: ")
          num1 = scala.io.StdIn.readInt()
        }
        else {
          print("Enter first number: ")
          num1 = scala.io.StdIn.readInt()

          print("Enter second number: ")
          num2 = scala.io.StdIn.readInt()
        }

//            ch match {
//              case '+' => result = num1+num2
//                    case '-'=> result=num1-num2
//                    case '*'=> result=num1*num2
//                    case '/'=> result=num1/num2
//                    case '%'=> result=num1%num2
//                    case '|'=> result= (num1).abs
//                    //case '^'=> result= (scala.math.pow(a,b)): Double
//                    case '>'=> result= if(num1>num2) num1 else num2
//                    case '<'=> result= if(num1>num2) num2 else num1
//                    case _=>printf("Invalid operation.\n")
//            }
//            println("Result: " + result);


        ch match {
          case '+' => result = add(num1, num2)
          case '-' => result = subtract(num1, num2)
          case '*' => result = multiply(num1, num2)
          case '/' => result = divide(num1, num2)
          case '%' => result = modulus(num1, num2)
          case '|' => result = absolute(num1)
          case '^'=> result= power(num1,num2)
          case '>' => result = max(num1, num2)
          case '<' => result = min(num1, num2)
          case _ => printf("Invalid operation.\n")
        }
        println("Result: " + result);
      }
    }
  }


}
