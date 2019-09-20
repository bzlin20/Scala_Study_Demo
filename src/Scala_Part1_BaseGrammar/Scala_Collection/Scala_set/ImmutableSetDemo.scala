package Scala_Collection.Scala_set

import scala.collection.immutable.HashSet

/*=========================不可变set
*
* */

object ImmutableSetDemo extends App {

    val set1 = new HashSet[Int]()
    //将元素和set合并成一个新的set，原有的set不变
    val  set2 = set1+4
    //set中元素不能重复
    val set3 = set1 ++ Set(5,6,7)

    val set0 = Set(1,2,3,4) ++ set1

    println(set0.mkString("#"))



}
