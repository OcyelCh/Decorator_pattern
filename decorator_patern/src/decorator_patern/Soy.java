package decorator_patern;

public class Soy extends CondimentDecorator{

	
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		
		if(beverage.getSize()==Size.TALL)	
		{
			cost = cost + .10;
		} else if(beverage.getSize()==Size.GRANDE)
		{
			cost = cost + .15;
		} else if(beverage.getSize()==Size.VENTI)
			cost = cost + .20;
		
		return cost;
	}
}
