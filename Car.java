public class Car

{
 String brandName;//decalring
   String color;
  int price;
  float mileage;
  int engineCapacity;
  byte noOfAirbags;
  int topSpeed;
  boolean havingAc;
 
 

 Car(String brandName,String color,int price,float mileage,int engineCapacity,byte noOfAirbags,int topSpeed,boolean havingAc )//calling and passing arguments
 {
System.out.println("---car Features---");

	this.brandName=brandName;
	this.color=color;
	this.price=price;  
	this.mileage=mileage;
	this.engineCapacity=engineCapacity;
	this.noOfAirbags=noOfAirbags;
	this.topSpeed=topSpeed;
	this.havingAc=havingAc;
 }





public static void main(String args[])

{
 Car obj =new Car("Ertiga ZXi Plus","silver",1200000,12.5f,1991,(byte)2,200,true);
 System.out.println("Brand Name : " +obj.brandName);
 System.out.println("Color: " +obj.color);
 System.out.println("Price :" +obj.price);
 System.out.println("Mileage : " +obj.mileage);
 System.out.println("EngineCapacity: " +obj.engineCapacity);
 System.out.println("NoOfAirBags :" +obj.noOfAirbags);
 System.out.println("TopSpeed :" +obj.topSpeed);
 System.out.println("HavingAC :"+obj.havingAc);

System.out.println("***********");

Car obj1 =new Car("Swift","White",800000,22.38f,1197,(byte)7,170,true);
 System.out.println("Brand Name : " +obj1.brandName);
 System.out.println("Color: " +obj1.color);
 System.out.println("Price :" +obj1.price);
 System.out.println("Mileage : " +obj1.mileage);
 System.out.println("EngineCapacity: " +obj1.engineCapacity);
 System.out.println("NoOfAirBags :" +obj1.noOfAirbags);
 System.out.println("TopSpeed :" +obj1.topSpeed);
 System.out.println("HavingAC :"+obj1.havingAc);
 
 System.out.println("***********");

Car obj2 =new Car("Mercedes Benz","Black",4000000,22.38f,1197,(byte)2,170,true);
 System.out.println("Brand Name : " +obj2.brandName);
 System.out.println("Color: " +obj2.color);
 System.out.println("Price :" +obj2.price);
 System.out.println("Mileage : " +obj2.mileage);
 System.out.println("EngineCapacity: " +obj2.engineCapacity);
 System.out.println("NoOfAirBags :" +obj2.noOfAirbags);
 System.out.println("TopSpeed :" +obj2.topSpeed);
 System.out.println("HavingAC :"+obj2.havingAc);
 
 System.out.println("***********");

Car obj3 =new Car("Kia","WHITE",1489000,18.5f,1497,(byte)6,167,true);
 System.out.println("Brand Name : " +obj3.brandName);
 System.out.println("Color: " +obj3.color);
 System.out.println("Price :" +obj3.price);
 System.out.println("Mileage : " +obj3.mileage);
 System.out.println("EngineCapacity: " +obj3.engineCapacity);
 System.out.println("NoOfAirBags :" +obj3.noOfAirbags);
 System.out.println("TopSpeed :" +obj3.topSpeed);
 System.out.println("HavingAC :"+obj3.havingAc);

 
 System.out.println("***********");

Car obj4 =new Car("Duster","Maroon",1425000,19.87f,1461,(byte)2,180,true);
 System.out.println("Brand Name : " +obj4.brandName);
 System.out.println("Color: " +obj4.color);
 System.out.println("Price :" +obj4.price);
 System.out.println("Mileage : " +obj4.mileage);
 System.out.println("EngineCapacity: " +obj4.engineCapacity);
 System.out.println("NoOfAirBags :" +obj4.noOfAirbags);
 System.out.println("TopSpeed :" +obj4.topSpeed);
 System.out.println("HavingAC :"+obj4.havingAc);




}

}