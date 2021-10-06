package stream;

import java.util.stream.IntStream;

public class Numbers
{
	public static void main(String[] args)
	{
		IntStream.
			range(1, 111)
			.filter(num -> num%2==1)
			.forEach(sa-> System.out.print(sa+" , "));
				
	}
}
