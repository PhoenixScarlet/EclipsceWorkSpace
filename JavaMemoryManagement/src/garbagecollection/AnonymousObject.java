package garbagecollection;

public class AnonymousObject {
	String obj_name; 
    
    public AnonymousObject(String obj_name)  
    { 
        this.obj_name = obj_name; 
    } 
  
    public static void main(String args[]) 
    { 
        new AnonymousObject("t1");  
        System.gc(); 
      
    } 
      
    @Override
    protected void finalize() throws Throwable  
    { 
       
        System.out.println(this.obj_name + " successfully garbage collected"); 
    } 

}
