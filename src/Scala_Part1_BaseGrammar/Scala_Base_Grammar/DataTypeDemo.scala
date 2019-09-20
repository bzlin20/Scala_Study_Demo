package Scala_Base_Grammar
/*
* 数据类型
* 有7种数值类型 byte,char,short,int,long,float,double 和boolean类型，再加上常用的String类型
*
*要点：
1、 Any 是所有类的父类，包括值类型 AnyVal，和引用类型 AnyRef
2、 AnyVal 是所有值类型的父类，包括 Int，Double，Boolean，Unit 等等
3、 AnyRef 是所有引用类型的父类，包括 Null
4、 Null 是所有引用类型的子类
5、 Nothing 是所有类的子类
6、 Unit 类型只有一个实例，是()，相当于 java 中的 void，没有任何的实质意义
7、 Null 也只有一个实例，是 null，相当于 java 中的 null，能赋值给任何引用类型变量，不
能赋值给值类型变量

*
* */
object DataTypeDemo {
  def main(args: Array[String]): Unit = {
    val  var_int = 1
    val  var_double = 3.33
    val  var_float = 2.4F
    val  var_char = 'A'
    val  var_bool = true

    val  var_16 = 0x29
    val  var_string = "aa"
    val  var_string1 = "\"huangbo\""
    val  var_string2 = """hello\thello\na\t\\"""

    print(var_string2)

  }
}
