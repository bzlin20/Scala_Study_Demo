package Scala_Part2_OOP.Scala_Extends

/*--===============Scala 继承  --扩展类
*在 Scala 中扩展类的方式和 Java 一样都是使用 extends 关键字
1、Scala 中，让子类继承父类，与 Java 一样，也是使用 extends 关键字
2、继承就代表，子类可以从父类继承父类的 field 和 method；然后子类可以在自己内部放
入父类所没有，子类特有的 field 和 method；使用继承可以有效复用代码
3、子类可以覆盖父类的 field 和 method；但是如果父类用 final 修饰，field 和 method 用 final
修饰，则该类是无法被继承的，field 和 method 是无法被覆盖的
* */

object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    val student = new Student("aa",33,"123")
    println()

  }
}
class Person(name:String,age:Int){
  println("person ："+name+"\t"+age)
}
class Student(name: String, age: Int, studentNo: String) extends  Person(name,age){
      println("Student : "+ name + "\t" + age + "\t" + studentNo)
}
