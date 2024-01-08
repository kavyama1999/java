public class Table
{
     //states

String color;
String brandName;
int price;
String materail;
String type;
boolean foldable;


Table(String color,String brandName,int price,String materail,String type,boolean foldable )
{

this.color=color;
this.brandName=brandName;
this.price=price;
this.materail=materail;
this.type=type;
this.foldable=foldable;
}


//Behaviours

static void  writing()
{
	
System.out.println("used for writing");

}
static void work()
{
	System.out.println("for working purpose");
}
static void ironing()
{
	
	System.out.println("Used for Ironing");
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






