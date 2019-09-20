package Scala_Part2_OOP.Scala_Case

import scala.util.Random

/*
*  ==================================样例类
*  case class 是多例的，后面要跟构造参数，case object 是单例的
* */
object CaseYLDemo  extends  App {
  val arr = Array(CheckTimeOutTask,HeartBeat(123),SubmitTask("001","TASK"))

  arr(Random.nextInt(arr.length)) match{
      case SubmitTask(id, name) => println(s"$id, $name")
      case HeartBeat(time)      => println(time)
      case CheckTimeOutTask     => println("check")
  }

}
case class SubmitTask(id:String,name:String)
case class HeartBeat(time:Long)
case object CheckTimeOutTask