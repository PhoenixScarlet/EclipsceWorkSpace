package garbagecollection;

public class ReassigningReferenceVariable {
	String obj_name;  
    public ReassigningReferenceVariable(String obj_name)  
    { 
        this.obj_name = obj_name; 
    } 
      
    public static void main(String args[]) 
    { 
    	ReassigningReferenceVariable t1 = new ReassigningReferenceVariable("t1"); 
    	ReassigningReferenceVariable t2 = new ReassigningReferenceVariable("t2"); 
       
        t2 = t1; 
         
        System.gc(); 
    } 
      
    @Override
    /* Overriding finalize method to check which object 
     is garbage collected */
    protected void finalize() throws Throwable  
    { 
        System.out.println(this.obj_name + " successfully garbage collected"); 
    } 
}
