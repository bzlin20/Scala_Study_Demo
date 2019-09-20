package Stage1_Train
/*
* scala版worldcount
* */
object ScalaWorld {
  def main(args: Array[String]): Unit = {
      val arr = Array("hello","hi","nice","hi","you","this is scala worldcount simple"
                      ,"you can so easy to understand worldcount")

     val result= arr.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(t=>(t._1,t._2.length))
      .toList.sortBy(_._2).reverse
    println(result)

  }
}
