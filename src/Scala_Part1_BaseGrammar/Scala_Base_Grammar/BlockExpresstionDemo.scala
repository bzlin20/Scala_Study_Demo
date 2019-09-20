package Scala_Base_Grammar

/*
* 块表达式
*
* 就算是赋值表达式，也是有返回值的。是空，是 Unit
* */
object BlockExpresstionDemo {
  def main(args: Array[String]): Unit = {
    val x=0
   //在scala中{}包含一系列表达式   块中最后一个表达式的值就是块的值
    val result ={
      if (x<0){
        -1
      }else if (x>=1){
        1
      }else{
        "error"
      }
    }

    println(result)
    val tes ={val cc =1;val bb=2;val dd=bb+cc  ;dd}
    println(tes)
  }

}
