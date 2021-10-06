package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference
{
	public static void main(String[] args)
	{
		List<String> names= Arrays.asList("Navin","Ram", "laxman");
		
		Consumer<String> con = new Consumer<String>()
		{

			@Override
			public void accept(String t)
			{
				// TODO Auto-generated method stub
				System.out.println(t);
				
			}
			
		};
		
		names.forEach(i -> System.out.println(i)); //by using lamda
		
		names.forEach(System.out::println);
		
	}
}
