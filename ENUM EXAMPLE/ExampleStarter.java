public class ExampleStarter
{
public static void main(String args[])
{
Example obj=new Example(BloodGroups.APOSITIVE,Semister.SIX,Days.MONDAY,Result.PASS,Gender.MALE,Grade.A,Class.ONLINE,Food.VEG ,Ratings.TWO,TrafficLight.GREEN);
obj.display();



System.out.println(obj.blood.value);
System.out.println(obj.sem.values);

System.out.println(obj.day.value);
System.out.println(obj.result.value);

System.out.println(obj.gender.value);
System.out.println(obj.grade.value);

System.out.println(obj.rates.value);
System.out.println(obj.cls.value);

System.out.println(obj.light.value);
System.out.println(obj.food.value);



if(obj.sem.values==6)
{
	System.out.println("The given sem value 6 is Equal to 6");
}
else
{
	System.out.println("The given sem value 6 is Not Equal to 6");
}

if(obj.rates.value==4)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}

switch(obj.food)
{
	case VEG:
	{
		System.out.println("The given food is veg");
		break;
	}
	case NONVEG:
	{
		System.out.println("The given food is Non_veg");
		break;
	
	}
	
	
}




//System.out.println(obj.food.values);
                  //(refernce name)




//Semister sem=new Semister("two");
//System.out.println("sem");




/*if(obj.blood.value == Apositive)
{
	System.out.println("true");
}
else 
{
	System.out.println("false");
}*/

}
}




