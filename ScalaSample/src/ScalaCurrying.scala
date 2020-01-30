

object ScalaCurrying {
  def main(args:Array[String]){
     /*Transform a function that takes multiple args to single args*/
       def addnum1(x:Int,y:Int)=x+y
       def addnum2(x:Int)=(y:Int)=>x+y
       def addnum3(x:Int) (y:Int)=x+y
       
       println(addnum1(20,70))
       println(addnum2(20)(70))
       
       val currypartial=addnum2(20)
       println(currypartial(20))
       
       println(addnum3(120)(130)) 
       
       val partialFunction=addnum3(350)_
       println(partialFunction(700))
       
  }
}