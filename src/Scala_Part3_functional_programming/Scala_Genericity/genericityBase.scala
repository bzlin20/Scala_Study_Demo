package Scala_Part3_functional_programming.Scala_Genericity

/*       Scala泛型基础
*泛型用于指定方法或类可以接受任意类型参数，参数在实际使用时才被确定，泛型可以有效
地增强程序的适用性，使用泛型可以使得类或方法具有更强的通用性。泛型的典型应用场景
是集合及集合中的方法参数，可以说同 Java 一样，Scala 中泛型无处不在，具体可查看 Scala
的 API
泛型类：指定类可以接受任意类型参数。
泛型方法：指定方法可以接受任意类型参数。
* */
class Person[T](var name:T)
class Student[T,S](name:T,var age:S) extends Person(name)
object genericityBase {
  def main(args: Array[String]): Unit = {
    println(new Student[String,Int]("画像",33).name)

  }
}
