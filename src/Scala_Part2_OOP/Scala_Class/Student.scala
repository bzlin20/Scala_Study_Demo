package Scala_Part2_OOP.Scala_Class

import java.io.IOException

/*--=======================定义构造器
*
* 主构造器会执行类定义的所有语句
* */

/*
  * 每个类都有主构造器，主构造器的参数直接放置类名后面，与类交织在一起
  * 主构造器会执行类定义中的所有语句
  * 当在创建对象时，需要进行相关初始化操作时，可以将初始化语句放在类体中
  * 同样也可以在类中添加或重写相关方法
 */




class Student(val name:String,val age:Int) {
  println("执行主构造器")

  println("读取文件")

  private var gender = "male"

  //用this关键字定义辅助构造器
  def this(name:String,age:Int,gender:String){
    //每个辅助构造器必须以主构造器或其他的辅助构造器的调用开始
    this(name,age)
    println("执行辅助构造器")
    this.gender = gender
   //如果禁用掉了主构建器（使用 private 声明），则必须使用辅助构造函数来创建对象。
  }

}
