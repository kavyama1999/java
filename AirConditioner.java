public class AirConditioner
{

String brand;
int powerConsumption;
String color;
int price;
boolean isItDualClimate;
int warranty;

AirConditioner(String brand,int powerConsumption,String color,int price,boolean isItDualClimate,int warranty)
{
	this( brand, powerConsumption,color,price, isItDualClimate);
	//System.out.println("6");
	this.warranty=warranty;
	System.out.println("6");

}

AirConditioner(String brand,int powerConsumption,String color,int price,boolean isItDualClimate)
{
	this( brand, powerConsumption,color,price);
	this.isItDualClimate=isItDualClimate;
	System.out.println("5");

}

AirConditioner(String brand,int powerConsumption,String color,int price)
{
	this( brand, powerConsumption,color);
	this.price=price;
	System.out.println("4");

}

AirConditioner(String brand,int powerConsumption,String color)
{
	this( brand, powerConsumption);
	this.color=color;
	System.out.println("3");

}

AirConditioner(String brand,int powerConsumption)
{
	this( brand);
	this.powerConsumption=powerConsumption;
	System.out.println("2");

}

AirConditioner(String brand )
{
	this();
	this.brand=brand;
	System.out.println("1");

}

AirConditioner()
{
	
	//this.brand=brand;
	System.out.println("no");

}






public void AirConditionerDetails()
{
	System.out.println("Brand Name: " +brand);
	System.out.println("PowerConsumption: " +powerConsumption);
	System.out.println("Color : " +color);
	System.out.println("Price : " +price);
	System.out.println("IsItDualClimate : " +isItDualClimate);
	System.out.println("Warranty : " +warranty);
}

}