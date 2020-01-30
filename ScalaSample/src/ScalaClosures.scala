
  /*******Closures-a function which uses on or more variables declared outside this function*******/
object ScalaClosures {
  def main(args:Array[String]){
   
       number=100
       println(addresult1(90))//closure takes last changes made in variable
       println(addresult2(90))//closure changes also changes value
       
       println(number)
       /*Impure closure-(var)The result of closure changes based on changes made*/
       /*Pure closure-(val)The result of closure does not change based on changes made*/  
  }
   var number=10
       val addresult1=(x:Int)=>x+number
       val addresult2=(x:Int)=>{
         number=x+number
         number
       }
}