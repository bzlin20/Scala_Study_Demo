package Stage1_Train

/*scala阶段一、练习 99乘法表
*
* */
object Table99 {
  def main(args: Array[String]): Unit = {
    for(i <-  1 to 9){
       for(j <- 1 to i){
         print(i+"*"+j+"="+(i*j)+" " )
       }
      println()
    }

  }
}
