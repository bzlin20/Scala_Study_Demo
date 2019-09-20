package Scala_Base_Grammar
/*
* 流程控制--循环 for
*
* 1、在 scala 里面没有运算符，都有的符号其实都是方法。
2、在 scala 里面没有 ++ -- 的用法
3、for( i <- 表达式/数组/集合)
4、在 for 循环里面我们是可以添加 if 表达式
5、有两个特殊表达式需要了解：
 To 1 to 3 1 2 3
 To 1 to (3,2) 1 3
 Until 1 until 3 12
6、如果在使用 for 循环的时候，for 循环的时候我们需要获取，我们可以是使用 yield 关键字

*
* */

object ForDemo {
  def main(args: Array[String]): Unit = {
    //for(i <- 表达式),表达式 1 to 10 返回一个range(区间)
    //每次循环将区间中的一个值赋给i
     for (i <- 1 to 10)   //这里不用加{}也可以
       println(i)

     // for (i <- 数组)
    val arr= Array("a","b","c")
    for (i<- arr)
        println(i)

    //倒序打印
    for (str <- arr.reverse)
      println(str)

    //使用数组下标的方式进行打印
    for (i <- 0 to arr.length-1){
      println(arr(i))
    }

    for (i <- 0  until arr.length){
      println(arr(i))
    }

    //高级for循环
    for( i <- 1 to 3;j <- 1 to 3 if i == j)
      println((10*i+j)+" ")
    println()

    //for循环推导式：如果for循环的循环体以yield开始，则改循环会构建出一个集合
    val v = for(i<- 1 to 10) yield i*10
    println(v)
  }

}
