object Sorting extends App{

  val arr=Array(12,23,1,34,55,8,4)

  def sort(arr:Array[Int]):Array[Int]= {
    for(i<-0 until arr.length-1)
    {
      for(j<-0 until arr.length-i-1)
      {
        if (arr(j)>arr(j+1))
        {
          val swap=arr(j+1)
          arr(j+1)=arr(j)
          arr(j)=swap
        }

      }
    }
    arr
  }

  val a = sort(arr)
  for(i<-0 to a.length-1)
  {
    print(a(i)+ " ")
  }
}