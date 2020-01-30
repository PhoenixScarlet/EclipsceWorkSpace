package com.scalaabstractclass

class Rectangle1(var width:Double,var height:Double) extends Polygon1 {
 override def area : Double=width*height;
}