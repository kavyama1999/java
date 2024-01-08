public class NewsPaper
{
//states

int price;
String type;
String languageType;
String color;
int pages;

//Behaviours

static void read()
{
	
	System.out.println("Deposit");
}

static void givesInformation()
{
	System.out.println("  Gives Information");
}

static void knowledge ()
{
	System.out.println("Gives knowledge");
}

NewsPaper(int price,String type,String languageType,String color,int pages)
{
this.price=price;
this.type=type;
this.languageType=languageType;
this.color=color;
this.pages=pages;
}

void display()
{

System.out.println("price :" +price);
System.out.println("type :" +type);
System.out.println(" languageType:" +languageType);
System.out.println("color :" +color);
System.out.println("pages :" +pages);

}


}