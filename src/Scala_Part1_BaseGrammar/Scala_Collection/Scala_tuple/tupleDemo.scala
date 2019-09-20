package Scala_Collection.Scala_tuple

/**--==========================元组操作
  * 映射是 K/V 对偶的集合，对偶是元组的最简单形式，元组可以装着多个不同类型的值。
  *要和map做出区分
  *  map是这么定义的：
  *    val studentInfo=Map("john" -> 21, "stephen" -> 22,"lucy" -> 20)
  */


object tupleDemo {
  def main(args: Array[String]): Unit = {
     //创建元组
    val  tp = ("hadoop",3.12312,45411)

    //获取元组中的值
    val r1 = tp._1
    val r2 = tp._2

  }
}
