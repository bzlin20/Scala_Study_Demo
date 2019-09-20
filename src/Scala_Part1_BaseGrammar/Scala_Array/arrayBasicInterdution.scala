package Scala_Part1_BaseGrammar.Scala_Array

/* ==================数组的基本操作
 1、分类  定长数组和变长数组
   由于 Array 是不可变的，初始化之初就有了固定的长度，所以不能直接地对其元素进行
删除操作，也不能多增加元素，只能修改某个位置的元素的值，要实现删除可以通过过滤生
成新的 Array 的方式来删除不要的元素。所以也就没有 add,insert,remove 等操作。
 2、而 ArrayBuffer 是可变的，本身提供了很多元素的操作，当然包括增加，删除操作。
 3、如果你需要在 Array 和 ArrayBuffer 之间转换，那么分别调用 toBuffer()和 toArray()方法即
可
*
* */
object arrayBasicInterdution {
  def main(args: Array[String]): Unit = {
    //初始化一个长度为8的定长数组，其所有元素均为0
    val arr1 = new Array[Int](8)
    //直接打印定长数组，内容为数组的hashcode值
    println(arr1)
    //数组缓冲 tobuffer将数组转换长数组缓冲，相当于java中的toString
    println(arr1.toBuffer)

    //注意：如果 new，相当于调用了数组的 apply 方法，直接为数组赋值
    //初始化一个长度为 1 的定长数组
    val arr2 = Array[Int](8)
    println(arr2.toBuffer)

    //定义一个长度为3的定长数组
    val arr3 = Array("hadoop","spark","flink")
    //使用（）来访问数据
    println(arr3(2))

    /*
    * ============变长数组
    * 如果想使用数组缓冲，需要导入 import scala.collection.mutable.ArrayBuffer 包
    * */
    import scala.collection.mutable.ArrayBuffer

    val ab = ArrayBuffer[Int]()
    //向数组缓冲的尾部追加一个元素
    ab += 1
    //追加多个元素
    ab += (2,3,4,5,6,7,8,9,0)
    //追加一个数组 ++=
    ab++= Array(6,7)
    //追加一个数组缓冲
    ab ++= ArrayBuffer(8,9)

    //在数组某个位置插入元素用Insert
     ab.insert(0,-1,0)

    //删除数组某个位置的元素用remove
    ab.remove(8,2)

    println(ab)



  }
}
