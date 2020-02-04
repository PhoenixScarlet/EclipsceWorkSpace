package garbagecollection;

public class NullifyingReferenceVariable {
	String obj_name; 
    
    public NullifyingReferenceVariable(String obj_name)  
    { 
        this.obj_name = obj_name; 
    } 

    public static void main(String args[]) 
    { 
    	NullifyingReferenceVariable t1 = new NullifyingReferenceVariable("t1");      
        t1 = null; 
        System.gc(); 
    } 
      
    @Override
    protected void finalize() throws Throwable  
    { 
        
        System.out.println(this.obj_name + " successfully garbage collected"); 
    } 

}
