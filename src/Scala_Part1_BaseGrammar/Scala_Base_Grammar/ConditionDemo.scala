package Scala_Base_Grammar

/*
* 流程控制 -- 条件表达式if
*
* 1）if 条件表达式它是有返回值的
2）返回值会根据条件表达式的情况会进行自动的数据类型的推断（返回的是多个分支的共
同父类）
* */
object ConditionDemo {
  def main(args: Array[String]): Unit = {
    val x =1
    //判断x的值，将结果赋给y
    val y = if(x>0) 1 else -1
    println(y)

    //支持混合类型表达式
    val z = if (x>1)  1 else "error"
    println(z)

    //如果缺少else ,相当于if(x>2) 1 else ()
    val m = if(x>2) 1
    println(m)

    //在scala中每个表达式都有值，scala中有个unit类，写做(),相当于java中的void
    val n = if (x>2) 1 else ()
    println(n)

    //if 和else if
    val k = if(x<0) 0
    else if (x>1) 1 else -1
    println(k)
  }
}
