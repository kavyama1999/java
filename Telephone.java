public class Telephone{
Telephone(){
System.out.println("No parameters");
}


Telephone(double num){
	
	System.out.println("1st constructor ="  + num );
}

Telephone(double num1,float num2){
	
	System.out.println("2nd constructor =" + num1);
	System.out.println("2nd constructor=" + num2);
}

Telephone(float num2,double num1){
	
	System.out.println("3rd constructor =" + num2);
	System.out.println("3rd constructor=" + num1);
}


public static void main(String args[]){
 
 
 new Telephone();
 new Telephone(28.82568d);
 new Telephone(34.2546d,45.5f);
 new Telephone(80.5f,56.2568d);
 
}
}