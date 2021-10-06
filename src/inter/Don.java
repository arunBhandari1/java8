package inter;

public class Don implements IntefaceJava8, AnotherInter
{
	//third rule 
	// class method gets more priority than interface 

	@Override
	public void see()
	{
		// TODO Auto-generated method stub
		AnotherInter.super.see();
	}

}
