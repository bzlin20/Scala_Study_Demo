package Scala_Array

/*
* ======================遍历数组
* 1.增强for循环
* 2.使用to可以生产序列
* 2.好用的until会生成脚标
* */
object featchArray {
  def main(args: Array[String]): Unit = {
    //初始化一个数组
    val arr = Array(1,2,3,4,5,6,7,8,9)

    //增强for循环
    for (i <- arr)
      println(i)

    //使用to可以生产一个序列作为脚标
    for(i <- 0 to arr.length -1)
      println(arr(i))

    //使用until
    for(i <- 0 until arr.length)
      println(arr(i))

    //步长为2
    for(i <- (0 until (arr.length-2)))
      println(arr(i))
  }




}
