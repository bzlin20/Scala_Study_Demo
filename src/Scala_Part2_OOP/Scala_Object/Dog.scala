package Scala_Part2_OOP.Scala_Object
/*--====================伴生对象
*在 Scala 的类中，与类名相同的单例对象叫做伴生对象，也就是说如果我们在 object Dog 所
在的文件内定义了一个 class Dog，此时：
1、 object Dog 被称为 class Dog 的伴生对象
2、 class Dog 被称为 object Dog 的伴生类
3、 类和伴生对象之间可以相互访问私有的方法和属性

* */
class Dog {
    val id =100
    private var name = "旺财"
   def printName():Unit ={
     //在 Dog 类中可以访问伴生对象 Dog 的私有属性
     println(Dog.CONSTANT+name)
   }
}

/*
* 伴生对象
* */
object  Dog{
   //伴生对象中的私有属性
  private val CONSTANT:String = "汪汪汪："

  def main(args: Array[String]): Unit = {
    //访问私有的字段name
    val p = new Dog
    p.name = "123"
    p.printName()
  }

}

