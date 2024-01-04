public class Student
{

String studentName;
String address;
int addmissionNO;
static  String schoolName;
static String uniform;
static int schoolHours;




Student(String studentName,String address,int addmissionNO)
{
	this.studentName=studentName;
	this.address=address;
	this.addmissionNO=addmissionNO;
	
}

void display()
{
	
	System.out.println("Student Name :"+studentName);
	System.out.println("Address :"+address);
	System.out.println("AddmissionNO:"+addmissionNO);
	System.out.println("School Name:"+schoolName);
	System.out.println("Uniform Name:"+uniform);
	System.out.println("School Hours:"+schoolHours);
}



 //Declaring static Block
 
static
{
	schoolName = "Cambridege";
	uniform = "Blue";
    schoolHours = 8;

}


public static void main(String args[])
{
	
	Student obj=new Student("Smithan","Bengaluru",1256);
	obj.display();
	
	
	//Student.schoolName="NPPS";
	
	//Student obj1=new Student("Sathwik","Bengaluru",1259);
	//obj1.display();
	//static();
	
	
	Student.schoolName="New";
	student.uniform="red";
	
}
}





















