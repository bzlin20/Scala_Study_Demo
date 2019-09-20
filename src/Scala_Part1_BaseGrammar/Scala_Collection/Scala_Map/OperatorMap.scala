package Scala_Collection.Scala_Map

/*--===========Map常用操作
*
* */
object OperatorMap {
   val StudentInfo = scala.collection.mutable.Map("john"->31,"hilo"->28,"xiaoming"->39)
  //清除map
  println(StudentInfo.clear())
  //遍历map
  for(i<- StudentInfo) println(i)

  StudentInfo.foreach(e=>println(e._1+","+e._2))

  //添加元素
  println(StudentInfo.put("zz",41))

  //读取元素
  println(StudentInfo.get("xiaoming"))



}
