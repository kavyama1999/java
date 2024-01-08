public class Broom 
{
     //states

String color;
String brandName;
int price;
String materail;
String cleaningType;
boolean havingDust;


Broom(String color,String brandName,int price,String materail,String CleaningType,boolean havingDust )
{

this.color=color;
this.brandName=brandName;
this.price=price;
this.materail=materail;
this.cleaningType=cleaningType;
this.havingDust=havingDust;
}


//Behaviours

static void  sweep()
{
	
System.out.println("used for sweeping");

}
static void clean()
{
	System.out.println("for cleaning purpose");
}
static void crafts()
{
	System.out.println("for designing purpose");
}





void display()
{

System.out.println("color :" +color);
System.out.println("BrandName :" +brandName);
System.out.println("Price :" +price);
System.out.println("Materail :" +materail);
System.out.println("CleaningTypeType :" +cleaningType);
System.out.println("HavingDust :" +havingDust);
}
}






