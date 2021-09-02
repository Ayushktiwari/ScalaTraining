package day1

import scala.util.control.Breaks.{break, breakable}

object Calculator {


  def main(args: Array[String]) {
    var ch: Char = 0
    var num1: Double = 0.0
    var num2: Double = 0.0
    var result: Double = 0.0


    print("Choose operation to perform (+,-,*,/,%,|,>,<): \nAnd for exit type q :\n")
    breakable {
      while (true) {
        ch = scala.io.StdIn.readChar()

        if (ch == 'q') break()
        if (ch == '|') {
          print("Enter number: ")
          num1 = scala.io.StdIn.readDouble()
        }
        else {
          print("Enter first number: ")
          num1 = scala.io.StdIn.readDouble()

          print("Enter second number: ")
          num2 = scala.io.StdIn.readDouble()
        }

        ch match {
          case '+' => result = num1 + num2
          case '-' => result = num1 - num2
          case '*' => result = num1 * num2
          case '/' => result = num1 / num2
          case '%' => result = num1 % num2
          case '|' => result = (num1).abs
          case '^' => result = (scala.math.pow(num1, num2))
          case '>' => result = if (num1 > num2) num1 else num2
          case '<' => result = if (num1 > num2) num2 else num1
          case _ => printf("Invalid operation.\n")
        }
        println("Result: " + result);
      }
    }
  }


}
