package Scala_Part1_BaseGrammar.Scala_FunctionAndMethod

/*
* ====================方法和函数
*
* 方法  def m1(x:Int,y:Int):Int = x*y
*      方法的返回值类型可以不写，编译器可以自动推断出来，但是对于递归函数，必须指定返回类型
* 函数   val add = (x:Int,y:Int)=>x+y
*      函数的意义：表示接受两个 Int 类型的变量，然后做累加。经过 scala 的自动类型推断得知，最后返回的结果数据的类型也是 Int。
*
*  方法和函数的区别
* 1、函数可以作为参数传递给方法，也就是说函数可以作为方法的参数
* 2、函数可以作为方法的参数，但是也可以作为函数的参数，
* 3、方法也可以作为方法的参数
* */
object defineFunction {
   //定义一个方法
  //方法 m2 参数要求是一个函数，函数的参数必须是两个 Int 类型
  //返回值类型也是 Int 类型
  def m1(f:(Int,Int)=>Int):Int = f(2,6)      //方法里传入函数

  //定义一个需要两个int类型参数的方法
  def m2(f:(Int,Int)=>Int,x:Int,y:Int) =f(x,y)

 //定义一个需要两个int类型参数的方法
  def m3(x:Int,y:Int):Int = x+y

  //定义一个函数f1 ,参数是两个int类型，返回值是一个int类型
  val f1 =(x:Int,y:Int) =>x+y

  //再定义一个函数 f2
  val f2 = (m:Int,n:Int) => m*n

  def main(args: Array[String]): Unit = {
    //调用m1方法，传入f1函数
    val r1=m1(f1)
    println(r1)

    //调用m1方法，传入f2函数
    val r2= m1(f2)
    println(r2)

    //调用m2方法，传入f1函数
    val r3 =m2(f1,2,4)
    println(r3)

    //调用m2方法，传入f2函数
    val r4 = m2(f2,2,4)

    //调m2方法，传入mm方法作为参数
    println(m2(m3,3,4))


    /*
    * 在需要传入函数作为参数的位置上传入一个方法的话，那
    么这个方法会被自动的转换为函数作为参数，也可以通过“_”把方法转换为参数
    * */

  }
}
