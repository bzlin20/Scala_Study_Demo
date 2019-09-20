package Scala_Base_Grammar
/*
* 变量的定义
*
*
1）数据类型可以指定，也可以不指定，如果不指定，那么就会进行数据类型的自动推断。
2）如果指定数据类型，数据类型的执行方式是在变量名后面写一个冒号，然后写上数据类
型。
3）我们的 scala 里面变量的修饰符一共有两个，一个是 var，一个是 val
如果是 var 修饰的变量，那么这个变量的值是可以修改的
如果是 val 修饰的变量，那么这个变量的值是不可以修改的

* */
object VariableDemo {
  def main(args: Array[String]): Unit = {
    // 使用val定义的变量值是不可变得，相当于java里面的final修饰的变量
     val i = 1
    //使用var定义的变量是可变的，在scala中鼓励使用val
     var s = "hello"
    //Scala编译器会自动推断变量的类型，必要的时候可以指定类型
    //变量名在前，类型在后
     val str: String = "spark"

  }
}
