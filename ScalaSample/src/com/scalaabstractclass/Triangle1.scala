package com.scalaabstractclass

class Triangle1(var width:Double,var height:Double) extends Polygon1 {
 override def area:Double=width*height/2
}