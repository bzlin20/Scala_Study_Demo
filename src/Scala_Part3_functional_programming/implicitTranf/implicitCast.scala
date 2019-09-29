package Scala_Part3_functional_programming.implicitTranf

/*                   隐式转换
* 1、 隐式转换会首先从全局中寻找，寻找不到，才使用隐式参数
* 2、 隐式转换只能定义在 object 中
* 3、 如果隐式转换存在二义性，那么程序会跑错
* */
object implicitCast {
  //定义隐式转换的方法
  def rmb(dollar: Double)(implicit rate:Double =6)=dollar*rate
  def main(args: Array[String]): Unit = {
    println(rmb(100))
    println(rmb(100)(7))
    import MyPredef.current_rate
    println(rmb(100))
  }
}

object  MyPredef{
  //声明一个Double类型的隐式转换值
  implicit  var current_rate:Double = 6.66
}