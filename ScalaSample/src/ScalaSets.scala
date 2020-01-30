

object ScalaSets {
   def main(args:Array[String]){
      /*types-mutable set,immutable set
       set in scala are not ordered*/
       
       //immutable set
       val mySet1:Set[Int]=Set(1,2,5,4,5,6,7,5)
       println(mySet1)
       //mutable set
       var mySet2=scala.collection.mutable.Set(1,2,5,4,5,6,7,5)
       println(mySet2)
       println(mySet2+10)//adds new value
       println(mySet2(5))//check whether given value is present
       println(mySet2.head)
       println(mySet2.tail)
       println(mySet2.isEmpty)
       
       //concat set
       val mySet3:Set[Int]=Set(1,20,50,40,50,60,70,50)
       println(mySet1 ++ mySet3)
       println(mySet1.++(mySet3))
       
       //intersection of set
       println(mySet1.&(mySet3))
       println(mySet1.intersect(mySet3))
       println(mySet1.max)
       mySet1.foreach(println)
       mySet1.foreach(i=>println(i))
       for(x<-mySet2) println(x)
   }
}