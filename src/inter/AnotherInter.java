package inter;

public interface AnotherInter
{
	default public void see()
	{
		System.out.println("I can write method in interface  using default keyword");
	}
}
