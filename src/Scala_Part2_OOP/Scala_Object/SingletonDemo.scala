package Scala_Part2_OOP.Scala_Object
import scala.collection.mutable.ArrayBuffer
/*--============================单例对象
*在某些应用场景下，我们可能不需要创建对象，而是想直接调用方法，但是 Scala 语言并不
支持静态成员，没有静态方法和静态字段，Scala 通过单例对象 object 来解决该问题
1、存放工具方法和常量
2、高效共享单个不可变的实例
3、单例模式
* */
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    //单例对象，不需要new，用【类名.方法名】调用对象中的方法
    val session =SessionFactory.getSession()
    println(session)
  }
}

object SessionFactory {
  //相当于java中的静态块
   var counts =5
  val sessions = new ArrayBuffer[Session]()
   while(counts>0){
     sessions += new Session
     counts -= 1
   }

  //在object中的方法相当于java中的静态方法
  def getSession():Session={
    sessions.remove(0)
  }
}

class Session{}
/*
* 1、object 里面的方法都是静态方法
2、object 里面的字段都是静态字段
3、它本身就是一个单例，(因为不需要去 new)

* */
