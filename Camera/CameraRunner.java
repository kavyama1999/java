public class CameraRunner
{
public static void main (String args[])
{
String[] features={"RAW Format","HDR","Resolution","Image stabilization","Shutter Speed","Aperture"};

 Camera obj=new Camera("Sony",78000,2510,CameraType.COMPACTDIGITAL,BatteryType.LITHIUMBATTERY,ChargingType.TYPESA,2018,DisplayType.LCD,features);
  obj.displayCameraDetails();
  for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }
  
  System.out.println("*******************************");
  Camera obj1=new Camera("canon",30000,5184,CameraType.DIGITALSLRCAMERA,BatteryType.LITHIUMIONBATTERY,ChargingType.TYPEB,1986,DisplayType.OLED,features);
  obj1.displayCameraDetails();
  for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }

    System.out.println("****************************");
  Camera obj2=new Camera("Nikon",90000,24,CameraType.COMPACTDIGITAL,BatteryType.LITHIUMBATTERY,ChargingType.TYPESA,2018,DisplayType.LCD,features);
  obj2.displayCameraDetails();
  for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }

    System.out.println("************************************");
  Camera obj3=new Camera("Panasonic",78000,2510,CameraType.COMPACTDIGITAL,BatteryType.NIMH,ChargingType.WIRELESS,2018,DisplayType.LCD,features);
  obj3.displayCameraDetails();
  for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }

    System.out.println("***********************************");
  Camera obj4=new Camera("DSLR",200000,15,CameraType.SINGLELENS,BatteryType.LITHIUMIONBATTERY,ChargingType.USB,2018,DisplayType.EINK,features);
  obj4.displayCameraDetails();
  for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }

    System.out.println("****************************************");
  Camera obj5=new Camera("GoPro",80000,4000,CameraType.MIRRORLESS,BatteryType.NIMH,ChargingType.TYPESA,2018,DisplayType.EVF,features);
  obj5.displayCameraDetails();
for( int i=0;i<features.length;i++)
  {
	  System.out.println("Features :" +features[i]);
  }




switch (obj.type3)
{
	case USB:
	System.out.println("ChargingType is a USB");
	break;
	
	case WIRELESS:
	System.out.println("ChargingType is a WIRELESS ");
	break;
	
	case TYPESA :
	System.out.println("ChargingType is a TYPESA ");
	break;
	
	case TYPEB:
	System.out.println("ChargingType is a TYPEB ");
	break;
	case TYPEC :
	System.out.println("ChargingType is a TYPEC ");
	break;
}
}
}



//Sony",78000,2510,CameraType.COMPACTDIGITAL,BatteryType.LITHIUMBATTERY,ChargingType.TYPESA,2018,DisplayType.LCD);
//obj.displayCameraDetails();  USB,WIRELESS,TYPESA,TYPEB,TYPEC;