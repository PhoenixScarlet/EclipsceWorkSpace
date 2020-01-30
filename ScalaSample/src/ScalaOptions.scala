

 //container which 2 values -an instance of Some or None

object ScalaOptions {
  def main(args:Array[String]){
    
        val lis=List(1,2,3)
        val map=Map(101->"a",2->"b",3->"c")
        println(lis.find(_ > 6))//if no result /value present then returns None
        println(lis.find(_>1))//this returns Some(n) with count of result 
        println(map.get(101))//similar to find method returns None/Some for given key
        
        //extract result from Some
        println(lis.find(_>1).get)
         println(map.get(101).get)
         //to avoid exception
         println(map.get(2).getOrElse("Element not present"))
         println(lis.find(_>8).getOrElse("Element not present"))
         
         //define Option
         val opt:Option[Int]=None
         println(opt.isEmpty)
         val opt2:Option[Int]=Some(1)
         println(opt2.get)
  }
}