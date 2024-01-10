public class Cow extends Domestic 
{
	
//states

String color;
String name;
boolean isMilkProducing;
boolean isGrazing;
//Behaviours

void moo()
{
System.out.println("mooing");
}

void graze()
{
System.out.println("graze");
}

void stopGrazing()
{
System.out.println("stopGrazing");
}

}