public class AirConditioners
{
public static void main(String arguments[])
{

AirConditioner ac = new AirConditioner("Samsung",1748,"white",50000,true,2);
ac.AirConditionerDetails();


AirConditioner ac1 = new AirConditioner("Samsung",1748,"white",50000,true);
ac1.AirConditionerDetails();

AirConditioner ac2 = new AirConditioner("Blue Star",1700,"white",35000);
ac2.AirConditionerDetails();

AirConditioner ac3 = new AirConditioner("voltas",1600,"white");
ac3.AirConditionerDetails();

AirConditioner ac4 = new AirConditioner("Sony ",1000);
ac4.AirConditionerDetails();

AirConditioner ac5 = new AirConditioner("Haier");
ac5.AirConditionerDetails();

AirConditioner ac6 = new AirConditioner();
ac6.AirConditionerDetails();



}
}













