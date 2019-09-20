package Scala_Part2_OOP.Scala_Extends

/* --==========重写方法（Override 和 Super）
*1、Scala 中，如果子类要重写一个父类中的非抽象方法，则必须使用 override 关键字
2、override 关键字可以帮助我们尽早地发现代码里的错误，比如：override 修饰的父类方法
的方法名我们拼写错了；比如要覆盖的父类方法的参数我们写错了；等等
3、此外，在子类覆盖父类方法之后，如果我们在子类中就是要调用父类的被覆盖的方法呢？
那就可以使用 super 关键字，显式地指定要调用父类的方法
* */

object OverrideDemo {
  def main(args: Array[String]): Unit = {
     val student = new Students
    student.eat()
  }
}
abstract  class Persons{
  def eat()
}

class Students extends  Persons{
  override def eat(): Unit = {
    println("好吃的")
  }
}