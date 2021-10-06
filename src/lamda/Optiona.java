package lamda;

import java.util.Optional;

public class Optiona
{
	public static void main(String[] args)
	{
	 Optional.ofNullable("Hello")
						.ifPresent( System.out::println );

	}
}
