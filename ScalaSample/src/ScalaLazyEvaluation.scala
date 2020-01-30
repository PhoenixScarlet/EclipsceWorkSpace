//Strict evaluation-Compute value of a expression immediately
//Lazy evaluation-every expression waits for its first use
//scala supports both strict and lazy evaluation


/*class Strict{
  val s={
    println("Strict Evaluation")
    5
  }
}

class Lazy{
 lazy val l={
    println("Lazy Evaluation")//prints only if called
    5
  }
}

*/


object ScalaLazyEvaluation {
  
  //Lazy evaluation by call by name
  def method1(m:Int){
  println("Method 1")
  println(m)
}
  def method2(m: =>Int){//=>call by name parameter method
  println("Method 2")
  println(m)
}
  def main(args:Array[String]){
   /* val x=new Strict
    val y=new Lazy
    println(x.s)
    println(y.l)*/
    
    val add=(a:Int,b:Int)=>{
      println("Add")
      a+b
    }
    method1(add(5,6))
    method2(add(5,6))
  }
  
}