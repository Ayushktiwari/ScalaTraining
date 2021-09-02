package day5and6

class QueueImplementation {
  var queue:List[Double] = List.empty
  var front: Int = -1
  var rear: Int = -1

  def enqueue(item: Double): Unit = {
    if(rear == -1 && front == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(item)
      println("Item is enqueued.")
    }
    else{
      rear = rear + 1
      queue = queue ::: List(item)
      println("Item is enqueued.")
    }
  }

  def dequeue: Unit = {
    if(front == -1 && rear == -1){
     println("Underflow..")
    }
    else if(front == rear ){
      queue=queue.drop(1)
      front = -1
      rear = -1
      println("Item dequeued.")
    }
    else{
      queue = queue.drop(1)
      front = front + 1
      println("Item dequeued..")
    }
  }

  def getQueue: Unit = {
    println(queue)
  }
}

object Test3 {
  def main(args: Array[String]): Unit = {
    val queue = new QueueImplementation
    queue.enqueue(2)
    queue.enqueue(4)
    queue.enqueue(7)
    queue.enqueue(9)
    queue.dequeue
   // queue.dequeue
    println("Front is " + queue.front)
    println("Rear is " + queue.rear)
    queue.getQueue
  }
}