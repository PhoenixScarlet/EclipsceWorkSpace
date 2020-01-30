

object ScalaStringInterpolation {
   def main(args:Array[String]){
    val name="Lucy"
    val age=9
    println(""+name+" "+age ) //Type 1:println
    println(s"$name $age") //Type 2:s String Interpolation not type-safe
    println(f"$name%s  $age%d") //Type 2.1:For Type-safe
    println(raw"Hello \n world")//Type 3:raw Interpolation-prints as given literally
}
}