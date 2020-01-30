

object ScalaLoops {
  def main(args:Array[String]){
    println("*******while & do-while*******")
    
      var num1=0;
     while(num1<10){
       println("value1:"+num1)
       num1=num1+1
     }
     
     var num2=0;
     do{
       println("value2:"+num2)
       num2+=1
     }while(num2<10)
       
       /*******for loop*******/
         println("*******for loop*******")
       
       //using to
       for(iter <- 1 to 5 ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter)
       }
    //using to method
     for(iter <- 1.to( 5) ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter)
       }
     //until
     for(iter <- 1.until( 5) ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter)
       }
     
     //Multiple ranges i.e nested loop
     for(iter <- 1 to 9 ;iter1 <- 1 to 4 ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter +" "+iter1)
       }
     
     //iterate in list
     val list=List(1,2,3,4,5)
     for(iter <- list ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter)
       }
     
     //filter values (List)
     val list1=List(1,2,3,4,5)
     for(iter <- list1 ;if iter < 4 ) //takes "iter" automatically as var i.e mutable  
       {
         println(iter)
       }
     
     //for loop as expression
      val list3=List(1,2,3,4,5)
     var result=for{iter <- list3 ;if iter <4 } yield  //takes "iter" automatically as var i.e mutable  
       {                                              // to remove ; enter new line
         iter*iter
       }
     println(result)
  }
       
}