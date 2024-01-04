public class TrainglePattern
{
 public static void main(String[] args)
 {
   int n=5;
   for(int i=1; i<=5; i++)
   {
   for(int j=5; j>=1;j--)
   {
    if(j>i)
	{
	System.out.print(" ");
    }
	else
	{
	System.out.print("* ");
	}
   }
	System.out.println();
   }
   
  System.out.println("--------------------------"); 
  
  int count = 1;
  for(int i=1;i<=5;i++)
  {
	  for(int j=5;j>=i;j--)
	  {
		System.out.print(" ");
	  }
	  for(int k=1;k<=i;k++)
		System.out.print(i+" ");
	    System.out.println();
	  
  }
   
}
}
