package Scala_Part2_OOP.Scala_Case

/*--=======================样例类2
当一个类被声名为 case class 的时候，scala 会帮助我们做下面几件事情：
*1、构造器中的参数如果不被声明为 var 的话，它默认的话是 val 类型的，但一般不推荐将
构造器中的参数声明为 var
2、自动创建伴生对象，同时在里面给我们实现子 apply 方法，使得我们在使用的时候可以
不直接显示地 new 对象
3、伴生对象中同样会帮我们实现 unapply 方法，从而可以将 case class 应用于模式匹配
apply 方法接受参数返回对象，unapply 方法接收对象返回参数
4、实现自己的 toString、hashCode、copy、equals 方法
5、case class 主构造函数里面没有修饰符，默认的是 val
除此之此，case class 与其它普通的 scala 类没有区别
* */
object CaseYLDemo2 {
  // 接收参数，返回对象， 一般用作工厂
  def apply(value: Double, unit: String): Currency = new Currency(value, unit)
  def unapply(currency: Currency): Option[(Double, String)] = {
    if (currency == null){
      None
    }
    else{
      Some(currency.value, currency.unit)
    }
  }
}

class Currency(val value: Double, val unit: String) {
}