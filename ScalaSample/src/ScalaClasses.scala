//Classes-blueprint for creating object
//Object keyword-Singleton class(cannot create instance out of that object )
//constructor elements should be initialized with var/val

//var getter setter
//val getter  ----
//default --- ----
//private cannot use outside class
class User(private var name:String,var age:Int){
  def printName{println(name)}
}

object ScalaClasses {
   def main(args:Array[String]){
     var user=new User("Max",13);
     user.printName
     println(user.age);
     user.age=20
     user.printName
     println(user.age)
   }
}