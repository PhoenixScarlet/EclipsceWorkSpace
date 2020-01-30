

object ScalaHigherOrderFunction {
  def main(args:Array[String]){
    //Takes functions as arg and return functions
       //f=function name
       //2 args
       def math1(x:Double,y:Double,f:(Double,Double)=>Double):Double={
         f(x,y)
       }
       
       //more than 2 args
       def math2(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double={
         f(f(x,y),z)
       }
       
       //another way for more than 2 args
       def math3(x:Double,y:Double,z:Double,f:(Double,Double,Double)=>Double):Double={
         f(x,y,z)
       }
       
       //using wildcard to simplify code
        def math4(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double={
         f(f(x,y),z)
       }
       
       val output=math1(10,20,(x,y)=>x+y)
       println(output)
       val output1=math1(30,40,(x,y)=>x min y)//similarly max can be used
       println(output1)
       val output2=math2(50,60,70,(x,y)=>x+y)
       println(output2)
       val output3=math3(80,90,100,_+_+_)//(x,y,z)=>x+y+z
       println(output3)
        val output4=math4(10,20,10,_+_)//similarly max can be used
       println(output4)
       
       
  }
}