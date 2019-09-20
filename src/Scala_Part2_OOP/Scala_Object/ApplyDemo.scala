package Scala_Part2_OOP.Scala_Object

/*--==============Apply方法
val intList=List(1,2,3)这种方式创建初始化一个列表对象，
其实它相当于调用 val intList=List.apply(1,2,3)，只不过 val intList=List(1,2,3)这种创建方式更简
洁一点，但我们必须明确的是这种创建方式仍然避免不了 new，它后面的实现机制仍然是
new 的方式，只不过我们自己在使用的时候可以省去 new 的操作。通常我们会在类的伴生
对象中定义 apply 方法，当遇到【类名(参数 1,...参数 n)】时 apply 方法会被调用。
* */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    //调用了array伴生对象的apply方法
    //def apply(x:Int,xs:Int):Array[Int]
    //arr1中只有一个元素5
    val arr1 =Array(5)
    println(arr1.toBuffer)

    //new 了一个长度为5的array,数组里面包含5个0
    val arr2 = new Array[Int](5)
    println(arr2.mkString("#"))



  }
}
