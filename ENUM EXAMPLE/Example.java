public class Example
{
	
	
BloodGroups blood;//Declaration part
Semister sem;
Days day;
Result result;
Gender gender;
Grade grade;
Class cls;
Food food;
Ratings rates;
TrafficLight light;




Example(BloodGroups blood,Semister sem,Days day,Result result,Gender gender,Grade grade,Class cls,Food food,Ratings rates,TrafficLight light)
{
	this.blood=blood;
	this.sem=sem;
	this.day=day;
	this.result=result;
	this.gender=gender;
	this.grade=grade;
	this.cls=cls;
	this.food=food;
	this.rates=rates;
	this.light=light;
	
}




void display()
{
	System.out.println("Blood Group Name:"  +blood);
	System.out.println("Semister:"  +sem);
	System.out.println("Days:"  +day);
	System.out.println("Result:"  +result);
	System.out.println("Gender:"  +gender);
	System.out.println("Grade:"  +grade);
	System.out.println("cls:"  +cls);
	System.out.println("Food:"  +food);
	System.out.println("Ratings:"  +rates);
	System.out.println("TrafficLight:"  +light);
	

	}
	

}