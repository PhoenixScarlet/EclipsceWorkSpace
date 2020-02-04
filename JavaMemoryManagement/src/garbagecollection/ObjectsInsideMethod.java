package garbagecollection;

class ObjectsInsideMethod 
{ 
    String obj_name; 
    public ObjectsInsideMethod(String obj_name)  
    { 
        this.obj_name = obj_name; 
    } 
    static void show() 
    { 
    	ObjectsInsideMethod t1 = new ObjectsInsideMethod("t1");  
        display(); 
    } 
    static void display() 
    { 
       
    	ObjectsInsideMethod t2 = new ObjectsInsideMethod("t2");  
    } 
    public static void main(String args[]) 
    {  
        show();  
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
