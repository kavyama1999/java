public class Bottle
{
     //states

String color;
String brandName;
int price;
String materail;
String type;
int quantity;


Bottle(String color,String brandName,int price,String materail,String type,int  quantity)
{

this.color=color;
this.brandName=brandName;
this.price=price;
this.materail=materail;
this.type=type;
this.quantity=quantity;
}


//Behaviours

static void  open()
{
	
System.out.println("supporting");

}
static void pour()
{
	System.out.println("pouring liquid from the bottle");
}
static void seal()
{
	
	System.out.println("sealing the bottle");
}

static void store()
{
	
	System.out.println("store liquid");
}



void display()
{

System.out.println("color :" +color);
System.out.println("BrandName :" +brandName);
System.out.println("Price :" +price);
System.out.println("materail :" +materail);
System.out.println("Type :" +type);
System.out.println("quantity :" +quantity);
}
}






