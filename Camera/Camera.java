public class Camera
{
String brandName;
int price;
int resolution;
CameraType type1;
BatteryType type2;
ChargingType type3;
int modelYear;
DisplayType type4;
String[] features;


Camera(String brandName,int price,int resolution,CameraType type1,BatteryType type2,ChargingType type3,int modelYear,DisplayType type4,String[] features)//parameter constructor
{
	this.brandName=brandName;
	this.price=price;
	this.resolution=resolution;
	this.type1=type1;
	this.type2=type2;
    this.type3=type3;
	this.modelYear=modelYear;
    this.type4=type4;
	this.features=features;
}



public void displayCameraDetails()
{
	
	System.out.println("*******CAMERA DERAILS *******");
	System.out.println("BrandName :  " +brandName);
	System.out.println("Price :  " +price);
	System.out.println("Resolution :  " +resolution);
	System.out.println("CameraType :  " +type1);
	System.out.println("BatteryType :  " +type2);
	System.out.println("ChargingType :  " +type3);
	System.out.println("ModelYear :  " +modelYear);
	System.out.println("DisplayType : " + type4);
	System.out.println("Features : " );
	
	
}
}