

object ScalaMatchExpression {
  def main(args:Array[String]){
     //match as statement
     var mark =80
     mark match{
       case 81 =>println(mark)
       case 82 =>println(mark)
       case 83 =>println(mark)
       case 84 =>println(mark)
       case 85 =>println(mark)
       case _=>println("default value")//for non matching value else for matching value prints which matches case
     }
     
     //match as expression
     var marks=84
    var results= marks match{
       case 81 =>marks
       case 82 =>marks
       case 83 =>marks
       case 84 =>marks
       case 85 =>marks
       case _=>"default value"
     }
     println(results)
     
     //match multiple conditions
     var oddneven=6
     oddneven match {
       case 1|3|5|7|9 => println("odd")
       case 2|4|6|8|10 => println("even")
     }
  }
}