package Scala_Part3_functional_programming.Scala_Genericity

/*           Scala类型变量界定
*    类型变量界定是指在泛型的基础上，对泛型的范围进行进一步的界定，从而缩小泛型的具体
* */

class TypeLimit{
  def compare[T<:Comparable[T]](first:T,second:T): Unit ={
    if(first.compareTo(second)>0)
      first
    else
      second
  }
}
object TypeLimit {
  def main(args: Array[String]): Unit = {
    val tvb = new TypeLimit
    println(tvb.compare("a","b"))
  }
}
