//Auxillary constructors-alternative constructors of a class
//can have n number od auxillary constructor but with diff signatures
//should call previously defined constructor


class Employee(var Id:Int,var name:String){
 // def printId{println(Id)}
  //def printName{println(name)}
  def this(){//takes aero args
    this(1002,"Geethapriya")
  }
  def this(name:String){//takes one arg
    this(1003,name)//can define previous constructor(this()) or Employee()
  }
}  

object ScalaAuxillaryConstructor {
  def main(args:Array[String]){
   var employee1=new Employee(1001,"Swethaa")
   var employee2=new Employee()
   var employee3=new Employee("Joe")
   println(employee1.Id+" "+employee1.name)
   println(employee2.Id+" "+employee2.name)
   println(employee3.Id+" "+employee3.name)
   //employee.printId
  // employee.printName   
  }
}