package com.scalaabstractclass

abstract class Polygon1 {
  def area :Double;
}

object Polygon1{
    def main(args:Array[String]){
    var rectangle=new Rectangle1(55.0,20.0)
    var triangle=new Triangle1(30.0,20.0)
    print("Rectangle:")
    printArea(rectangle)
    print("Triangle:")
    printArea(triangle)
    }
    def printArea(p:Polygon1){
      println(p.area)
    } 
  }
   