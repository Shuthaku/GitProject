package abstractclass1;

public abstract class bank {
	
	//Abstraction;
	//partial abstraction
	
	int a;//
	public abstract  void loan(); //abstract method-no body
	
	//non abstract method
	
	public void credit()	
	{
		System.out.println("Bank ----credit");
	}
	public void debit()
	{
		System.out.println("bank-----debit");
	}

}
