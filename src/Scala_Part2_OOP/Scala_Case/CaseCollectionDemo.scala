package Scala_Part2_OOP.Scala_Case

/*
* ===============================匹配数组、元组、集合
* */
object CaseCollectionDemo  extends App{
    //匹配数组
    val arr = Array(1,3,5)
    arr match{
        case Array(1,x,y) => println("arr是数组")
        case Array(0)    => println("only 0")
        case _ => println("something else")

    //匹配集合
    val lst = List(3, -1)
          lst match {
            case 0 :: Nil => println("only 0")
            case x :: y :: Nil => println(s"x: $x y: $y")
            case 0 :: tail => println("0 ...")
            case _ => println("something else")
          }
     //匹配元组
    val tup =(2,3,7)
        tup match {
          case (1, x, y) => println(s"1, $x , $y")
          case (_, z, 5) => println(z)
          case _ => println("else")
        }

    }
}
