package com.scalatraits

class Rectangle2(var width:Double,var height:Double) 
extends Polygon2 with Shape {
  override def area : Double=width*height;
   def color:String="Black"//no override needed for methods from trait
}