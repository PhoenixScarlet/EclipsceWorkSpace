
 /*******String-immutable,comes from java*******/
object ScalaStrings {
  def main(args:Array[String]){
    
       val str1:String ="Hello"
       var str2:String=" world"
       println(str1.length())
       println(str1.concat(str2))
       println(str1 + str2)
       
       /*String formatting*/
        
       var n1=90
       var n2=10.98
       val outp=printf("(%d -- %f -- %s)",n1,n2,str1)
       println(outp)
       println("(%d -- %f -- %s)".format(n1,n2,str1))
       printf("(%d -- %f -- %s)",n1,n2,str1)
       
       
  }
}