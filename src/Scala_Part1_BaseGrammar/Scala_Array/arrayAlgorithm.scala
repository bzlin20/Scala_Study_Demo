package Scala_Part1_BaseGrammar.Scala_Array

/*===================数组常用算法和多维数组
*
* */
object arrayAlgorithm {
  def main(args: Array[String]): Unit = {
     val intArr = Array(1,2,3,4,5,6,7,8,9,10)

     println(intArr.sum)

    println(intArr.max)

    println(intArr.min)

    println(intArr.mkString(","))

    //scala的多维数组和java中的一样
    val miltArr = Array(Array(1,2,3,4),Array(1,3,23234,32))
    println(miltArr(0)(2))
  }

}
