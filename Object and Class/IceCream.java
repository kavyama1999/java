public class IceCream
{
     //states

String flavour;
String brandName;
int price;
int size;
String type;
String manuFactureMonth;


IceCream(String flavour,String brandName,int price,int size,String type,String manuFactureMonth)
{

this.flavour=flavour;
this.brandName=brandName;
this.price=price;
this.size=size;
this.type=type;
this.manuFactureMonth=manuFactureMonth;
}


void display()
{

System.out.println("Flavour :" +flavour);
System.out.println("BrandName :" +brandName);
System.out.println("Price :" +price);
System.out.println("Size :" +size);
System.out.println("Type :" +type);
System.out.println("ManuFactureMonth :" +manuFactureMonth);
}


    //Behaviours


static void  eat()
{
	
System.out.println("Ice cream eaten");

}
static void freeze(){
	System.out.println("Is freeze");
}

static void tasty()
{
	
	System.out.println("is very tasty");
}

static void Ismelt()
{
	
	System.out.println("is melt");
}
}





