

object ScalaFunctions2 {
   def main(args:Array[String]){
     println(Math.add(5, 78))
      println(Math square 5 )//For one arg only use syntactical sugar
      
     
      println(Math.multiply())
      println(Math.multiply(10))
      println(Math.multiply(y=20))
      
      
     //For void return type-Unit
       def subtract(x :Int ,y:Int):  Unit={
       println( x-y)
     }
      subtract(400,90) 
      
      //operator as function name not operator overloading
       println(Math.+(3,5))
       println(Math.**(3,5))
    
       //Functions are treated as first class citizens-can assign function to variable
       //Anonymous function
       var mul=(x:Int,y:Int)=>x*y
       println(mul(2,5))
       
   }
   object Math{
     def add(x :Int ,y:Int ):Int= return x+y
     
     def square(x:Int) =x*x
     
     def multiply(x:Int=6,y:Int=5):Int=return x*y
     
     def +(x :Int ,y:Int ):Int= return x+y
     
     def **(x :Int ,y:Int ):Int= return x*y
      
   }   
}