
object CollectionExample extends App {


  //  Grouped and Sliding method in Iterable trait
  val l1 = List(1,2,3,4,5)
  val res0 = l1 grouped(2)
  println(res0.next())
  println(res0.next())

  val res1 = l1 sliding(3)
  println(res1.next())
  println(res1.next())
  println(res1.next())

  //Operation on Sequence -> Indexing and length

  val s1 = Seq(1,2,3,4,5)
  val res2 = s1(3)
  println(s"Element at index 3 is : ${res2}")  // apply operation

  val s2 = Seq(1,2,3) lengthCompare(s1)   // lengthcompare operation
  println(s2)

  val res3 = s1.indices   //   The index range of s1, extending from 0 to s1.length - 1.
  println("Range of index  "+res3)

  // append and prepend to sequence
  val s3 = Seq(1,2,3,4,5,6) :+ 3  //appended
  println("New seq is "+s3)
  val s4 = 3+: Seq(1,2,3,4,5,6)   //prepended
  println("New seq is "+s4)
  val s5 = Seq(1,2,3) padTo(5,3)   // append with padTo
  println("New appended list is "+s5)


  val s6 = Seq(9,5,8,1,2,0,4,9,8)
  println("New sorted seq is"+s6.sorted)   // sorting
  println("Reverse is : "+ s6.reverse)   //reversing
  println("Removing duplicate value : "+ s6.distinct)   //removing duplicate element


  //  ---Operation on Set---

  val car = Set("BMW", "Audi", "suzuki")
  println(car contains("suzuki"))   // checking that given element is in the set
  println(car("suzuki") )   // same as contains
  println(car + "honda")  // adding element in set
  println(car - "honda")  // removing element from set

  //   Operation on map
  var capital = Map(("India","Delhi"), ("Afghanistan", "Kabul"),("Russia", "Moscow"))
  capital += ("Bhutan" -> "Thimphu")     //  adding key and value
  println(capital)
  println("Capital of India is: " +capital("India"))   // fetching value from key

}
