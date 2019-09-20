package Scala_Collection.Scala_list
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

import scala.collection.immutable._

/*--======================不可变的序列
*
* 在 Scala 中列表要么为空（Nil 表示空列表）要么是一个 head 元素加上一个 tail 列表。
9 :: List(5, 2) :: 操作符是将给定的头和尾创建一个新的列表
* */
object ImmutableListDemo {
  def main(args: Array[String]): Unit = {
     //创建一个不可变的集合
     val list1 = List(1,2,3)
    //将0插入list1的前面生成一个新的list
    val list2 = 0::list1
    val list3 = list1.::(0)

    //将一个元素添加到list1的后面产生一个新的集合
    val list4 = list1 :+ 3

    //将两个list合并成一个新的list
    val list5 = list1 ++ list2


  /*
  * 序列常用操作：
  * */


    val nums = 1::2::3::4::Nil

    //取第一个元素
    println(nums.head)

    //取第一个元素以外的元素，返回的是列表
   println(nums.tail)

    //取列表的第二个元素
    println(nums.tail.head)

    //list连接操作
    List(1,2,3):::List(4,5,6)

    //取除最后一个元素以外的元素，返回的是列表
    println(nums.init)

    //取列表的最后一个元素
    println(nums.last)

    //列表元素倒置
    println(nums.reverse)

    //list mkString方法
    println(nums.mkString("$"))

    //转换为数组
    println(nums.toArray)


  }
}
