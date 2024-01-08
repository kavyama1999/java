public class Car
{

//states

static String brandName;
String color;
int price;
String fuelType;
boolean airBag;
boolean ac;




Car( String color,int price,String fuelType,boolean airBag,boolean ac)
{
	//this.brandName=brandName;
	this.color=color;
	this.price=price;
	this.fuelType=fuelType;
	this.airBag=airBag;
	this.ac=ac;
	
}


void display()
{
	
	
	System.out.println("BrandName= " +brandName);
	System.out.println("color= " +color);
	System.out.println("price= " +price);
	System.out.println("fuelType= " +fuelType);
	System.out.println("Airbag= " +airBag);
	System.out.println("Ac= " +ac);
	
}

 //Behaviours

static void move()
{
	
	System.out.println("Is moving");
}


static void isStop()
{
	System.out.println("Is stop");
}

 static void IsLightsOn()
{
	
	System.out.println("Lights On");
}

static{
	
	brandName="Benz";
}


public static void main(String args[])
{
Car obj = new Car("Silver",1200000,"Petrol",true,true);
obj.display();
Car obj1= new Car("Silver",1800000,"Petrol",true,true);
Car.brandName="Eritiga";
obj1.display();
Car.brandName="Eritiga";
//car obj
 Car.move();
 Car.isStop();
Car.IsLightsOn();

}
}



//String brandName,String coloe,int price,String fuelType,boolean airBag,boolean ac)