      /*******Lists-immutable,linkedlist,0 indexed*******/

object ScalaList {
   def main(args:Array[String]){

        //Lists are ordered
       val myList:List[Int]=List(1,2,3,4,5)
       val names:List[String]=List("a","b","c")
       println(myList)
       println(names)
       
       //to alter list use type 1:cons(::) does not change list but just appends 
       println(0::myList)
       
       //to alter list use type 2:Nil ,creates a list
       println(1::2::3::Nil)
       
       //methods in list
       println(names.head)//displays first value
       println(names.tail)//display values other than first value
       println(names.isEmpty)
       println(names.reverse)
       println(names(1))//display index value
       println(List.fill(5)(2))//List.fill()-length()-value
       
       //iterate list
       myList.foreach(println)
       //Perform operation
       var addall :Int=0
       myList.foreach(addall +=_)
       println(addall)
       
       //iterate type 2
       for(names <- names) println(names)
       
       //get value by index
       println(names(0))
   }
}