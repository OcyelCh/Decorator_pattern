package decorator_patern;

public class Espresso extends Beverage{

	public Espresso()
	{
		description = "Espresso";
	}
	
	@Override
	public double cost()
	{
		if(size==Size.TALL)
			return 1.99;
		else if(size==Size.GRANDE)
			return 2.50;
		else if(size==Size.VENTI)
			return 2.99;
		else
			return 1.00;
	}
}
