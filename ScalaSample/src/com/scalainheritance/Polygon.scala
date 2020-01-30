package com.scalainheritance
//multiple inheritance not supported
class Polygon {
  def area :Double=0.0
}

 object Polygon{
    def main(args:Array[String]){
    var polygon=new Polygon
    var rectangle=new Rectangle(55.0,20.0)
    var triangle=new Triangle(30.0,20.0)
    print("Rectangle:")
    printArea(rectangle)
    print("Triangle:")
    printArea(triangle)
    }
    def printArea(p:Polygon){
      println(p.area)
    } 
  }
   