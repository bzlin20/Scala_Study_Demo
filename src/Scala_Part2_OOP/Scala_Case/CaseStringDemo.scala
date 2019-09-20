package Scala_Part2_OOP.Scala_Case

import scala.util.Random

/*--=======匹配字符串
*
* */
object CaseStringDemo {
  def main(args: Array[String]): Unit = {
    val arr= Array("小明","小花","小强")
    val name = arr(Random.nextInt(arr.length))

    //name模式匹配字符串
    name match{
      case "小明" => println("小明和他的小伙伴们来了")
      case "小花" => println("花花来了")
      case "小强" => println("光头强和熊大一起来了")
      case _      => println("还有谁？")
  }

  }
}
