 /*******Arrays-fixed length,same data type*******/
import Array._
object ScalaArrays {
 
         def main(args:Array[String]){
       val myArray1:Array[Int]=new Array[Int](5)
       val myArray2=new Array[Int](5)
       val myArray3=Array(5,10,15,20)
       //assign values 
        for(iter <- 0 to 4 ) 
       {
         myArray1(iter)=iter
       }
       //type 1
       for (x:Int<-myArray1){
         println(x)
       }
       //type 2
       for (x <- 0 to (myArray2.length-1)){
         println(myArray2(x))
       }
       //concat arrays
       val conactarray=concat(myArray1,myArray3)
       for (x:Int<-conactarray){
         println(x)
       }
       }
      
       
}