 package inter;

public interface IntefaceJava8
{
	//you cannot write default methods which is already in object class
	default public void see()
	{
		System.out.println("I can write method in interface  using default keyword");
	}
	//you can have static methods in interface you dont have to write default even
	static void show()
	{
		
	}
}
