package decorator_patern;

public class Mocha extends CondimentDecorator{

	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		
		double cost = beverage.cost();
		
		if(beverage.getSize()==Size.TALL)	
		{
			cost = cost + .05;
		} else if(beverage.getSize()==Size.GRANDE)
		{
			cost = cost + .10;
		} else if(beverage.getSize()==Size.VENTI)
			cost = cost + .15;
		
		return cost;
	}

}
