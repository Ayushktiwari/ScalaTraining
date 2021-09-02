package day5and6

object ListElement {

  def main(args: Array[String]) {
    val list = List("Ayush", "Aryan", "Akash", "Abhinav")
    val res0 = list(list.length - 1)
    val res1 = list.indexOf(res0)
    println(s"Last element of the list is --> $res0  && index is --> $res1")


    //  Print the table of each element in the List
    println("-- Printing each element of List --")
    for (element <- list)
      println(element)
  }


}
