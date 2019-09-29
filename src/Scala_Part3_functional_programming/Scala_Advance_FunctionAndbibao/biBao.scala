package Scala_Part3_functional_programming.Scala_Advance_FunctionAndbibao

/*
*                     闭包
* 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
* 闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。
* */
object biBao {
  def main(args: Array[String]): Unit = {
    var more =9
    val add_more = ((x:Int)=>x+more)
    println(add_more(1))
   /*
   * 在 add_more 中有两个变量：x 和 more。
   * 其中的一个 x 是函数的形式参数，
   * 在 add_more 函数被调用时，x 被赋予一个新的值
   * 。然而，more 不是形式参数，而是自由变量。
   * 这里我们引入一个自由变量 more，这个变量定义在函数外面
   * */
    more=10
    println(add_more(1))
  }
}
