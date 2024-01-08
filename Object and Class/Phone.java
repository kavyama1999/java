public class Phone
{
	//States
 String brandName;
 int storage;
 String color;
 int price;
 String type;
 boolean batteryBackup;

 
 //Behaviours
 void make_call()
  {
    System.out.println("Calling");
  }
  
void send_message()
 {
   System.out.println("Sending a message");
 }
void make_videoCall()
  {
    System.out.println("making Video Calling");
  }
       
           
Phone(String brandName,int storage,String color,int price,String type,boolean batteryBackup)
{
 this.brandName=brandName;
 this.storage=storage;
 this.color=color;
 this.price=price;
 this.type=type;
 this.batteryBackup=batteryBackup;
 
}
 
  void displayInformation()
 {
    System.out.println("phone BrandName:"+brandName);
	System.out.println("phone storage:"+storage);
	System.out.println("phone color:"+color);
	System.out.println("phone price:"+price);
	System.out.println("Type:"+type);
	System.out.println("phone batteryBackup:"+batteryBackup);
 }
 

}
