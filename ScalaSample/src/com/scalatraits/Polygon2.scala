package com.scalatraits

//traits-partially implemented interfaces
//may contain abstract n non-abstract methods
trait Shape{
   def color :String;
}

abstract class Polygon2 {
  def area :Double;
}


 object Polygon2{
    def main(args:Array[String]){
    
    var rectangle=new Rectangle2(55.0,20.0)
    var triangle=new Triangle2(30.0,20.0)
    print("Rectangle:")
    printArea(rectangle)
    println(rectangle.color)
    print("Triangle:")
    printArea(triangle)
    println(triangle.color)
    }
    def printArea(p:Polygon2){
      println(p.area)
    } 
  }
   