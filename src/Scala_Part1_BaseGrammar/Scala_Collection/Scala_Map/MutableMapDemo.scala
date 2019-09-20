package Scala_Collection.Scala_Map

import scala.collection.mutable

/*--====================================Map集合
*
*
*
* */
object MutableMapDemo extends  App {

  //构建map
   val Score = Map("a"->13,"b"->18,"c"->22)
   val map1 = new mutable.HashMap[String,Int]()

  //向map中添加数据
  map1("spark")=1
  map1 +=(("hadoop",2))
  map1.put("flink",3)
  println(map1)

  //从map中移除元素
  map1 -="spark"
  map1.remove("hadoop")
  println(map1)

}
