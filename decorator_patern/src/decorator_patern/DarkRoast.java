package decorator_patern;

public class DarkRoast extends Beverage {

	public DarkRoast()
	{
		description = "Dark Roast coffe";
	}
	
	@Override
	public double cost() 
	{
		if(size==Size.TALL)
			return .99;
		else if(size==Size.GRANDE)
			return 1.50;
		else if(size==Size.VENTI)
			return 1.99;
		else
			return .50;
	}

	
}
