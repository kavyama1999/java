public class Jupiter{
	
Jupiter(){
		System.out.println("1st constructor");
	}
	
Jupiter(long number){
	System.out.println("2nd constructor " + number);
}
Jupiter(long number,short val){
	System.out.println("3rd constructor " + number);
	System.out.println("3rd constructor " + val);
}


Jupiter(short val,long number){
	System.out.println("4th constructor " + number);
	System.out.println("4th constructor " + val);
}


	




public static void main(String args[])
{
	new Jupiter();
	new Jupiter(958673l);
	short val=25000;
	new Jupiter(val,987436l);
	new Jupiter(3659845l,val);
    
	}

}