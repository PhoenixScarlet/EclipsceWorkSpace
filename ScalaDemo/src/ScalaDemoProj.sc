object ScalaDemoProj {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Scala provides REPL(Read Eval Print Loop)
  //var & val
  val num1:Int=8                                  //> num1  : Int = 8
  var num2:Int=7                                  //> num2  : Int = 7
  println(num1+num2)                              //> 15
  num2=23

  println(num1+num2)                              //> 31
  
  var result=8 .+(7)                              //> result  : Int = 15
  
  
  //Creating class and Objects
  case class Student(var rollno:Int =1,var name:String="Swethaa",var marks:Int=99)
  {
  }
  
  var s1=Student();                               //> s1  : ScalaDemoProj.Student = Student(1,Swethaa,99)
  var s2=Student(2,"Geetha",89)                   //> s2  : ScalaDemoProj.Student = Student(2,Geetha,89)
  var s3=Student(7)                               //> s3  : ScalaDemoProj.Student = Student(7,Swethaa,99)
  var s4=Student(name="joe")                      //> s4  : ScalaDemoProj.Student = Student(1,joe,99)
  
  //creating methods
  case class Student1(var rollno:Int =1,var name:String="Swethaa",var marks:Int=99)
  {
  
  def show()=println("hello")
  def show1()={println("inside brackets")}
  def  >(m2:Student1):Boolean=marks>m2.marks
  
  }
  var s5=Student1(name="swethaa")                 //> s5  : ScalaDemoProj.Student1 = Student1(1,swethaa,99)
  s5.show()                                       //> hello
  s5.show1()                                      //> inside brackets
  var m1=Student1()                               //> m1  : ScalaDemoProj.Student1 = Student1(1,Swethaa,99)
  var m2=Student1(2,"Ragavi",90)                  //> m2  : ScalaDemoProj.Student1 = Student1(2,Ragavi,90)
  m1.>(m2)                                        //> res0: Boolean = true
  
  
  
  //	List
  var list=List(2,4,67,8,7,444)                   //> list  : List[Int] = List(2, 4, 67, 8, 7, 444)
  //iterate list for each loop
  for(n <- list) println(n)                       //> 2
                                                  //| 4
                                                  //| 67
                                                  //| 8
                                                  //| 7
                                                  //| 444
    list.reverse                                  //> res1: List[Int] = List(444, 7, 8, 67, 4, 2)
    list.foreach{i:Int=>println(i)}               //> 2
                                                  //| 4
                                                  //| 67
                                                  //| 8
                                                  //| 7
                                                  //| 444
    list.drop (2)                                 //> res2: List[Int] = List(67, 8, 7, 444)
    list.drop (2).take(2)                         //> res3: List[Int] = List(67, 8)
    list drop 3                                   //> res4: List[Int] = List(8, 7, 444)
    
     var list1=List(2,4,67,8,7,444,true)          //> list1  : List[AnyVal] = List(2, 4, 67, 8, 7, 444, true)
      var list2=List("hELLO","WORLD")             //> list2  : List[String] = List(hELLO, WORLD)
     var list3=List(1,2,3,'S')                    //> list3  : List[Int] = List(1, 2, 3, 83)
   
    
    case class Stud(rollno:Int,name:String,marks:Int)
    val stud=List(Stud(1,"a",56),Stud(2,"b",55),Stud(3,"c",99))
                                                  //> stud  : List[ScalaDemoProj.Stud] = List(Stud(1,a,56), Stud(2,b,55), Stud(3,
                                                  //| c,99))
    
    var firts=stud.head                           //> firts  : ScalaDemoProj.Stud = Stud(1,a,56)
     var last=stud.tail                           //> last  : List[ScalaDemoProj.Stud] = List(Stud(2,b,55), Stud(3,c,99))
    
    
}