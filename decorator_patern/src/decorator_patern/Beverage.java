package decorator_patern;

public abstract class Beverage {
	
	public enum Size { TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String description = "Unknow Beverage";


public String getDescription()
{
	return description + " " + size;
}

public void setSize(Size size)
{
	this.size = size;
}

public Size getSize()
{
	return this.size;
}

public abstract double cost();

}
