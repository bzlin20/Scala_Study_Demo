package Scala_Part3_functional_programming.Scala_Advance_FunctionAndbibao

/*
*     Scala 高阶函数
* 1、一种是将一个函数当做另外一个函数的参数（即函数的参数是函数）
* 2、另外一种是返回值是函数的函数（即函数的返回值是函数）
* */

object advanceFunction {
  def main(args: Array[String]): Unit = {

    val  arr = Array(1,3,4,5,6,7,8,12)
    //定义函数
    val add =(x:Int,y:Int)=>{x+y}
    val max =(x:Int,y:Int)=>{if (x>y) x else y}
    //使用函数
    println(arr.reduce(add))
    println(arr.reduce(max))

    //函数的各种写法
    arr.map((x:Int)=>x+2)
    arr.map(x=>x+2)
    arr.map(_+2)

  }
}
/*
* 高阶函数
*
* */

class functions{
  def main(args: Array[String]): Unit = {
  //1、函数返回值为函数
    //作为返回值：一个方法的返回结果值是一个函数
  val  arr = Array(1,3,4,5,6,7,8,12)
    def add(x:Int) = {(y:Int)=>x+y}
    val add1 = add(2)
    println(add1(4))

  //2、函数/方法的参数为函数
    //作为参数：一个方法的参数不是一个值，而是一个函数，就是一个计算逻辑
    def f3=(f: (Int, Int) => Int) => f(2,6)
    val adds =(x:Int,y:Int)=>x+y
    println(f3(adds))




  }
}
