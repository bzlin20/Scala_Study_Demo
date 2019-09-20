package Scala_Part2_OOP.Scala_Trait
/*-====================1、将特征作为接口使用
 scala 不支持对类进行多继承，
但是支持多重继承 trait，使用 with 关键字即可
*
* 继承 trait 后，必须实现其中的抽象方法，实现时不需要使用 override 关键字
* */

trait MySQLDao {
    val id:Int
  def delete(id:String):Boolean = true
  //定义一个抽象方法不需要加abstract，加了abstract反而报错
  def  add(o:Any):Boolean
  def update(o:Any):Int
  def querary(id:String):List[Any]
}

class DaoImpl extends  MySQLDao with Serializable{
  //给父类的抽象字段赋值
  override val id: Int = 12

  override def add(o: Any): Boolean = true

  override def update(o: Any): Int = 1

  override def querary(id: String): List[Any] = List(1,2,3)
}
