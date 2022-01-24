package decorator_patern;

public class Decaf extends Beverage {
	
	public Decaf()
	{
		description = "Decaf coffe";
	}
	
	@Override
	public double cost()
	{
		if(size==Size.TALL)
			return 1.05;
		else if(size==Size.GRANDE)
			return 1.55;
		else if(size==Size.VENTI)
			return 2.05;
		else
			return .55;
	}

}
