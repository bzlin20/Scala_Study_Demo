package Scala_Collection.Scala_set

import scala.collection.mutable

/*--==========================可变set
*
*
* */
object MutableSetDemo  extends App {
    //传建一个可变的hashset
  val set1 = new mutable.HashSet[Int]()

  //向hashset中添加元素
  set1 += 2
  //add等价于+=
  set1.add(4)
  set1 ++= Set(1,2,3,4,5)

  //删除一个元素
  set1 -= 5
  set1.remove(2)
  println(set1)
}
