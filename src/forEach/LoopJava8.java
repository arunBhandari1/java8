package forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LoopJava8
{
	
	
	public static void main(String[] args)
	{
		List<Integer> inte= Arrays.asList(1,2,3,45,6);
		//these are external looops
//		for(Integer is: inte)
//		{
//			System.out.println(is);
//		}
		
		//this is internal loop from java 8
		// -> this arrow is called lambda expression
		// consumet is functionalinterface
		inte.forEach(i -> System.out.println(i));
//		
//		inte.forEach(new Consumer<Integer>() {
// 
//
//			@Override
//			public void accept(Integer t)
//			{
//				System.out.println(t);
//				
//			}
//			
//		});
		
	}
	
	
}
