package Scala_Base_Grammar

/*
* 流程控制--循环 while
*
* 1）while 使用跟 java 一模一样
  2）注意点：在 scala 里面不支持 i++ i-- 等操作统一写成 i+=1 i-=1
* */
object whileDemo {
  def main(args: Array[String]): Unit = {
     var n=10
     while(n>0){
       println(n)
       n -= 1
     }
  }
}
