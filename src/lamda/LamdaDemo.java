package lamda;

interface A
{
	void show(int i);
}

class Xyz implements A
{
	public void show(int i)
	{
		System.out.println("from class Xyz");
	}
}

public class LamdaDemo
{
	public static void main(String[] args)
	{
		// Just Regular way of doing it 
		A as = new Xyz();
		as.show(0);
		
		
		// anonymous class before java 8
		A lab = new A()
		{
			public void show(int i)
			{
				System.out.println("from anynomus class");
			}
		};

		//java 8 way of writing anonymous class which has only one method with 
		//one line code  is in class
		A obj2 = i -> System.out.println("anonmous class in java 8 ");

		obj2.show(6);
	}
}
