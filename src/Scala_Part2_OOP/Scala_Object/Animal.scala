package Scala_Part2_OOP.Scala_Object

/*--============抽象类
抽象类是一种不能被实例化的类，抽象类中包括了若干不能完整定义的方法，这些方法由子
类去扩展定义自己的实现。
1、如果在父类中，有某些方法无法立即实现，而需要依赖不同的子类来覆盖，重写实现自
己不同的方法实现。此时可以将父类中的这些方法不给出具体的实现，只有方法签名，这
种方法就是抽象方法。
2、而一个类中如果有一个抽象方法，那么类就必须用 abstract 来声明为抽象类，此时抽象
类是不可以实例化的
3、在子类中覆盖抽象类的抽象方法时，不需要使用 override 关键字

* */

abstract class Animal {
   //抽象字段
  var height:Int
  def eat:Unit
}
class Person(var height:Int) extends Animal{
  override def eat: Unit = {
    println("eat good")
  }
}
//Scala 抽象类的使用方式和 Java 中的抽象类的概念一致