

object ScalaIfElse {
  def main(args:Array[String]){
    val num=2
    var res="";//res->response
    if(num==2){
      //println("num==2")
      res="num==2"
    }
    else{
      //println("num!=2")
      res="num!=2"
    }
    println(res)
    
    var res2=if(num!=2)"num!=2" else "num==2"//if else as expression
      println(res2)
  }
}