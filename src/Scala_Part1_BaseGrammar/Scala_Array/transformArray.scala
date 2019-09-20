package Scala_Part1_BaseGrammar.Scala_Array

/*=============数组转换
 yield 关键字将原始的数组进行转换会产生一个新的数组，原始的数组不变
*
* */
object transformArray {
  def main(args: Array[String]): Unit = {
    //定义一个数组
    val arr = Array(1,2,3,4,5,6,7,8,9)
    //将偶数取出来乘10后再生成一个新的数组
    val res= for(e<- arr if e%2 ==0) yield  e*10
    println(res.toBuffer)

    //高级写法
    val r=arr.filter(_%2==0).map(_*10)
    println(r.toBuffer)
  }
}
