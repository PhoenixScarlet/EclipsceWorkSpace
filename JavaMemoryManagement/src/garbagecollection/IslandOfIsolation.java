package garbagecollection;
public class IslandOfIsolation 
{ 
	IslandOfIsolation i; 
	public static void main(String[] args) 
	{ 
		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
	     obj2.i = obj1;

	     obj1 = null;  //Line A
	     obj2 = null;  //Line B

		System.gc(); 
		
	} 

	@Override
	protected void finalize() throws Throwable 
	{ 
		System.out.println("Finalize method called"); 
	} 
} 
