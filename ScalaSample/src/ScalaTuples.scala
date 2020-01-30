 //can have different data types,immutable(size fixed),ordered

object ScalaTuples {
  def main(args:Array[String]){
    
        val myTuple=(1,2,3,"swe","gee",true)
        println(myTuple)
        
        //add no.of elements after Tuple i.e,for example Tuple5
        //size limit is upto 22 i.e., Tuple22 if > then another concept must be used
         val myTuple2=new Tuple5(1,2,3,"swe",true)
         println(myTuple._4)
         println(myTuple2._5)//given value of specified index
        
       //iterate
         myTuple.productIterator.foreach{iter =>
        println(iter)   
        }
        
        //creating tuple valid for two elements like key-value pair
        println(1 ->"swe" ->true ->2.4)
        val myTuple3=new Tuple3(1,2,('a',2))
        println(myTuple3._3)//display 3rd element in the tuple
        println(myTuple3._3._2)//displays 2nd element in the 3rd tuple
  }
}