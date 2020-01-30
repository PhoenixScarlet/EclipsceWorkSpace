//maps 2 types-immutable,mutable
//maps are unordered,keys unique i,e., keys are set in map
//if duplicate keys it ignores the duplicate and takes value of last duplicated key

object ScalaMaps {
   def main(args:Array[String]){
     
       val myMap : Map[Int,String]=Map(101 -> "swe",102 -> "gee",103 ->"manoj",104 -> "nissar");
        println(myMap)
        println(myMap(101))
        println(myMap.keys)
        println(myMap.values)
        println(myMap.isEmpty)
        
        //iterate map
        myMap.keys.foreach {key =>
          println("Keys: "+key)
          println("Values: "+myMap(key))
        }
       
        //check key present,prevents exception
        println(myMap.contains(102))
        
        val myMap2:Map[Int,String]=Map(105 ->"Arun",106 ->"Muthu")
        //concat map
        println(myMap ++ myMap2)
        println(myMap.size)
   }
}