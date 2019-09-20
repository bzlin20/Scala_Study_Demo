package Scala_Collection.Scala_list

import scala.collection.mutable.ListBuffer
/*===================可变序列
*
* */
object MutableListDemo {
  def main(args: Array[String]): Unit = {
    //构建一个可变序列
     val lst0 = ListBuffer[Int](1,2,3)

    //创建一个空的可变序列
    val lst1 = new ListBuffer[Int]
    //向lst1中追加元素,没有生成新的集合
    lst1 +=4
    lst1.append(5)

    //将lst0和lst1合并成一个新的ListBuffer
    val lst2 =lst0 ++ lst1

    //将元素追加到lst0的后面生成一个新的集合
    val lst3 = lst0 :+ 5

  }

}
