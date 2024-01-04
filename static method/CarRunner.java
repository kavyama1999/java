
public class CarRunner
{
public static void main(String []args)
{




//static method

Cars.eritiga();
Cars.etios();
Cars.swift();
Cars.kn();
Cars.benz();



Cars obj=new Cars();
obj.benz();

//Non static method

//Cars.toyata();

System.out.println("***NON STATIC METHODS***");

Cars obj1=new Cars();//instance creation or object
obj1.toyata();


Cars obj2=new Cars();
obj2.thar();

Cars obj3=new Cars();
obj3.fortuner();

Cars obj4=new Cars();
obj4.kwid();


Cars obj5=new Cars();
obj5.kia();

Cars obj6=new Cars();
obj6.wagon();
}
}





























