import java.util.Date

object ScalaPartiallyAppliedFunctions {
  def main(args:Array[String]){
    println("******* Fully Applied Functions*******")
       val sum=(a:Int,b:Int,c:Int)=>a+b+c
       println(sum(1,2,3))
       
          println("******* Partially Applied Functions*******")
       var pfun=sum(10,_:Int,_:Int)
       println(pfun(20,30))
       
       /*Partially Applied Functions-for logging info*/
       def log(date:Date,message:String)=println(date+" "+message)
       
       val date=new Date;
       val newlog=log(date,_:String)
       newlog("The message 1")
  }
}