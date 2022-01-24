package decorator_patern;


public class HouseBlend extends Beverage{
	
	public HouseBlend()
	{
		description = "House Blend Coffe";
	}

	@Override
	public double cost() 
	{
		if(size==Size.TALL)
			return .89;
		else if(size==Size.GRANDE)
			return 1.19;
		else if(size==Size.VENTI)
			return 2.69;
		else
			return .49;
	}
	
	

}
