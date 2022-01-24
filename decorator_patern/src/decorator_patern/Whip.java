package decorator_patern;

public class Whip extends CondimentDecorator {
	
	
	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		
			double cost = beverage.cost();
			
			if(beverage.getSize()==Size.TALL)	
			{
				cost = cost + .15;
			} else if(beverage.getSize()==Size.GRANDE)
			{
				cost = cost + .30;
			} else if(beverage.getSize()==Size.VENTI)
				cost = cost + .45;
			
			return cost;
	}

}
