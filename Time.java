public class Time{
Time(){
System.out.println("No parameters");
}


Time(float num){
	
	System.out.println("1st constructor ="  + num );
}

Time(short num1,float num2){
	
	System.out.println("2nd constructor =" + num1);
	System.out.println("2nd constructor=" + num2);
}

Time(float num2,short num1){
	
	System.out.println("3rd constructor =" + num2);
	System.out.println("3rd constructor=" + num1);
}


public static void main(String args[]){
 
 
 new Time();
 new Time(28.8f);
 short num1=2564;
 new Time(num1,25.4f);
 new Time(90.5f,num1);

}
}