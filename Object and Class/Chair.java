public class Chair
{
     //states

String color;
String brandName;
int price;
String materail;
String type;
boolean foldable;


Chair(String color,String brandName,int price,String materail,String type,boolean foldable )
{

this.color=color;
this.brandName=brandName;
this.price=price;
this.materail=materail;
this.type=type;
this.foldable=foldable;
}


//Behaviours

static void  support()
{
	
System.out.println("supporting");

}
static void sit()
{
	System.out.println("sitting");
}
static void relax()
{
	
	System.out.println(" relaxing");
}

static void eat()
{
	
	System.out.println("used for eating");
}



void display()
{

System.out.println("color :" +color);
System.out.println("BrandName :" +brandName);
System.out.println("Price :" +price);
System.out.println("materail :" +materail);
System.out.println("Type :" +type);
System.out.println("foldable :" +foldable);
}
}






