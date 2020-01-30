
/*******Functions - group of statements perform task*******/
object ScalaFunctions {
  //Type 1 
   def add(x :Int ,y:Int ):Int={
       return x+y
     }
   
   //Type 2:No return keyword  and brackets
    def multiply(x :Int ,y:Int ):Int=x*y 
  
   //Type 3:No return data type
      def divide(x :Int ,y:Int )=x/y
    
    def main(args:Array[String]){
     println(add(45,89))  
     println(multiply(45,89))
     println(divide(78,8))
    }
  
}