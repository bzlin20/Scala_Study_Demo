package Scala_Part2_OOP.Scala_Case

import scala.util.Random

/*
* ================匹配类型
* */
object CaseTypeDemo  extends App {
   val arr = Array("hello",1,2.0,CaseStringDemo)
   val v = arr(Random.nextInt(4))
  println("目标字段为:"+v)
  //模式匹配
  v match{
      case x:Int     => println("Int"+x)
      case y:Double  => println("Double"+y)
      case z:String  => println("String"+z)
      //如不符合守卫条件，将掉入 case _中
      case _         => throw new Exception("not match exception")
  }
}
