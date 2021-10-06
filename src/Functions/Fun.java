package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Fun
{
	public static void main(String[] args)
	{
		System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
		
	}
	
	 static Function<Integer, Integer> incrementByOneFunction =
	            number -> number + 1;

	    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

	    static int incrementByOne(int number) {
	        return number + 1;
	    }

	    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
	            (numberToIncrementByOne, numberToMultiplyBy)
	                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

	    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
	        return (number + 1) * numToMultiplyBy;
	    }
}
