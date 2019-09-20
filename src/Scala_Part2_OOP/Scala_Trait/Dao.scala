package Scala_Part2_OOP.Scala_Trait

/*--=========Trait示例
*
* */

trait Dao {
   //抽象字段
 val id:Int
    //具体字段
  val name:String = "Scala"
   //带方法的具体方法
   def delete(id:String):Boolean = true
  //定义一个抽象方法不需要加abstract，加了abstract反而报错
  def  add(o:Any):Boolean
  def update(o:Any):Int
  def querary(id:String):List[Any]


}
