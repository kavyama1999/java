public class Bag
{
     //states

String color;
String brandName;
int price;
int size;
String type;
boolean waterProof;


Bag(String color,String brandName,int price,int size,String type,boolean waterProof )
{

this.color=color;
this.brandName=brandName;
this.price=price;
this.size=size;
this.type=type;
this.waterProof=waterProof;
}



void display()
{

System.out.println("color :" +color);
System.out.println("BrandName :" +brandName);
System.out.println("Price :" +price);
System.out.println("Size :" +size);
System.out.println("Type :" +type);
System.out.println("waterProof :" +waterProof);
}


//Behaviours

static void  carry()
{
	
System.out.println("cary some things");

}
static void givesSafety()
{
	System.out.println("Is Safety");
}
static void zipSystem()
{
	
	System.out.println("it is Zipsystem");
}


}





