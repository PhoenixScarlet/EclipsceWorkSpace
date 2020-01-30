package com.scalatraits

class Triangle2(var width:Double,var height:Double) 
extends Polygon2 with Shape {
  override def area:Double=width*height/2
 def color:String="Yellow"//no override needed for methods from trait
}