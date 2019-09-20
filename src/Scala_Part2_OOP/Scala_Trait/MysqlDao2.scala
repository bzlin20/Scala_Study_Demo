package Scala_Part2_OOP.Scala_Trait
/*
* --=========================在 Trait 中定义具体方法和属性
* */
trait MysqlDao2 {
  val id:Int
  val name:String = "huangbo"
  def add(o:Any):Boolean
  def update(o:Any):Int
  def query(id:String):List[Any]
  def delete(id:Int) = {println("delete one record")}

}

class DaoImpl2 extends  MysqlDao2 with Serializable{
  override val id: Int = 12

  override def add(o: Any): Boolean = true

  override def update(o: Any): Int = 1

  override def query(id: String): List[Any] = List(1,2,3)
}