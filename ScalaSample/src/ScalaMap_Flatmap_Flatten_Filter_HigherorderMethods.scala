 

object ScalaMap_Flatmap_Flatten_Filter_HigherorderMethods {
  def main(args:Array[String]){
    //map itertes over all collection
        val lst=List(11,25,37)
        val maps=Map(101->"a",2->"b",3->"c")
        println(lst.map(_ *2))
        println(lst.map(x =>x*2))
        println(lst.map(x=>"hello"*x))
        
        println(maps.map(x =>"hello" + x))
        println(maps.mapValues(x=>"hello"+x))
        
        //map can also be used with string
        println("hello world".map(_.toUpper))
        //flatten method flattens the collection
        println(List(List(10,20,30),List(40,50,60)))
        println(List(List(10,20,30),List(40,50,60)).flatten)
        
        //flatMap acts as shorthand of map and flattens
        println(lst.map(x =>List(x,x+1)))
        println(lst.flatMap(x =>List(x,x+1)))//displays that element with element+1
        
        //filter method -used with a predicate(func which returns boolean value)
        println(lst.filter(x =>x%2!=0))//H ERE X%2!=0 IS THE PREDICATE
  }
  
}