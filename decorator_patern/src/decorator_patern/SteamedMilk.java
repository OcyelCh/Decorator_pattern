package decorator_patern;

public class SteamedMilk extends CondimentDecorator{
	
	
	public SteamedMilk(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		
		double cost = beverage.cost();
		
		if(beverage.getSize()==Size.TALL)	
		{
			cost = cost + .03;
		} else if(beverage.getSize()==Size.GRANDE)
		{
			cost = cost + .06;
		} else if(beverage.getSize()==Size.VENTI)
			cost = cost + .09;
		
		return cost;
	}

}
