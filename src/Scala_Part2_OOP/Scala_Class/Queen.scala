package Scala_Part2_OOP.Scala_Class

/*
* 辅助构造函数具有两个特点：
1、辅助构建器的名称为 this，Java 中的辅助构造函数与类名相同，这常常会导致修改类名
时出现不少问题，scala 语言避免了这样的问题；
2、调用辅助构造函数时，必须先调用主构造函数或其它已经定义好的构造函数。
*
* */

//构造器参数可以不带 val 或 var，
//如果不带 val 或 var 的参数至少被一个方法所使用，那么它将会被提升为字段
//在类名后面加 private 就变成了私有的，相当于禁用了主构造器
class Queen private(val name:String,prop:Array[String],private  var age:Int=18){
        print(prop.size)
  //prop 被下面的方法使用后，prop 就变成了不可变的对象私有字段，
  //等同于 private[this] val prop
  //如果没有被方法使用该参数将不被保存为字段
  //仅仅是一个可以被主构造器中的代码访问的普通参数
  def desc=name +"is"+age+"years old with "+prop.toBuffer

}
object  Queen{
  def main(args: Array[String]): Unit = {
    val q= new Queen("aa",Array("小赤佬","大神"),24)
  }

}
