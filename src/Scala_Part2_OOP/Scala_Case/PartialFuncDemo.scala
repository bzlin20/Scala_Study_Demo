package Scala_Part2_OOP.Scala_Case

/*
*被包在花括号内没有 match 的一组 case 语句是一个偏函数，它是 PartialFunction[A, B]的一
个实例，A 代表参数类型，B 代表返回值类型，常用作输入模式匹配
* */


object PartialFuncDemo extends  App {

  //谝函数   A为String B为Int
  def func1:PartialFunction[String,Int] ={
        case "one"=> 1
        case "two"=> 2
        case  _  => -1
  }
  //普通函数的模式匹配实现
  def func2(num:String):Int = num match{
    case "one"=> 1
    case "two"=> 2
    case  _  => -1
  }

  println(func1("one"))
  println(func2("one"))

}
