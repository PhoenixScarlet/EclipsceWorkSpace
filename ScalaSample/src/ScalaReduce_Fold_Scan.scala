//Used in Collections
//reduceleft,reducerigght,foldleft,foldright,scanleft,scanright
//above methods used -apply binary operator on each element of a collection-
//where result of each step passed to next step
//reduce -takes associative binary operator function as parameter

object ScalaReduce_Fold_Scan {
 
  def main(args:Array[String]){
        val lts1=List(1,2,3,45,55)
        val lts2=List("a","b","c","d","e")
        println(lts2.reduceLeft(_ + _))//here "a"+"b"="ab"->"ab"+"c"="abc"....
        println(lts1.reduceLeft(_+_))//here (1+2)=3->(3+3)=6->(6+45)=51->(51+55)=16
        println(lts1.reduceLeft((x,y)=>{println(x+" "+y); x+y;}))//explicitly
        println(lts1.reduceRight(_-_))
        println(lts1.reduceLeft(_-_))
        
        
        //fold-same as reduce but can pass initial/last element as arg
        println(lts1.foldLeft(10)(_+_))
        println(lts2.foldLeft("z")(_+_))
        println(lts2.foldRight("z")(_+_))
        
        //scan-same as fold but gives map of intermediate result
        println(lts2.scanLeft("z")(_+_))
        println(lts2.scanRight("z")(_+_))
  }
 
}