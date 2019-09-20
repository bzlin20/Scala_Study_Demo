package Scala_Part2_OOP.Scala_Class

/*--============================定义类
*
* 在scala中，类并不用声明为public
* 在scala文件中，文件名可以不用和类名一致
* scala源文件中可以包含多个类，所有这些类都具有共有可见性
* */

class Person {
  //用val修饰的变量是只读属性，有getter但没有setter
  //相当于java中用final修饰的变量
  val id = "100"

  //用val修饰的变量既有getter又有setter
  var age:Int = 33

  //类私有字段，只能在当前类的内部或伴生对象中使用
  private  var name:String = "黄渤"

  //对象私有化字段，只能在当前对象中访问，伴生对象都不能访问
  private[this] val nickname = "影帝"


}
