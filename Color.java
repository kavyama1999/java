public class Color{
public static void main(String[] args){
	
//byteArray

byte[] byteArray={(byte)20,(byte)35,(byte)45,(byte)50,(byte)60,(byte)70,(byte)80,(byte)90};
System.out.println("array");
for(int i=0;i<byteArray.length;i++)
{
System.out.println(byteArray[i]);
}
System.out.println("Reverse of an array");

for(int i=byteArray.length-1;i>=0;i--)//reverse array
		{
		System.out.println(byteArray[i]);
		}
		
		System.out.println("sum of an array");
		
			int num=0; //sum of an array
			for(int i=0;i<byteArray.length;i++)
				num=num+byteArray[i];
				{
			System.out.println(num);
				}
				System.out.println("left array");
			for(int i=(byteArray.length-1)/2;i>=0;i--)//left array
			{
				System.out.println(byteArray[i]);
			}
			System.out.println("right array");
			for(int i=(byteArray.length-1)/2;i<byteArray.length;i++)
			{
				System.out.println(byteArray[i]);//right array
			}
			
		System.out.println("Even array values");	
	for(int i=0;i<byteArray.length;i++)
		if(byteArray[i]%2==0)//even
		{
			System.out.println(byteArray[i]);
		}
		
		System.out.println("odd array values");
		for(int i=0;i<byteArray.length;i++)
		if(byteArray[i]%2!=0)//odd
	
	
	{
			System.out.println(byteArray[i]);
		
	}	
	

			
			
//charArray
			char[] charArray={'a','b','c','k','m','n','p','y'};
			System.out.println(" Reverse of an array");
			for(int i=charArray.length-1;i>=0;i--)//reverse of a array
			{
				System.out.println(charArray[i]);
			}
			System.out.println("sum of an array");
			int sum=0; //sum of an array
			for(int i=0;i<charArray.length;i++)
				sum=sum+charArray[i];
				{
			System.out.println(sum);
				}
				System.out.println("left array");
			for(int i=(charArray.length-1)/2;i>=0;i--)//left array
			{
				System.out.println(charArray[i]);
			}
			System.out.println("right array");
			for(int i=(charArray.length-1)/2;i<charArray.length;i++)
			{
				System.out.println(charArray[i]);//right array
			}
			
		System.out.println("Even array values");	
	for(int i=0;i<charArray.length;i++)
		if(charArray[i]%2==0)//even
		{
			System.out.println(charArray[i]);
		}
		
		System.out.println("odd array values");
		for(int i=0;i<charArray.length;i++)
		if(charArray[i]%2!=0)//odd
	
	
	{
			System.out.println(charArray[i]);
		
	}

//floatArray	
	System.out.println("reverse of an array");
	float[] floatArray={1.2f,2.3f,3.3f,4.2f,6.2f,8.4f,10.0f,12.2f};
	for(int i=floatArray.length-1;i>=0;i--)
		{
		System.out.println(floatArray[i]);
		}
		
		System.out.println("sum of an array");
		float sum2=0;
			//int sum2=0; //sum of an array
			for(int i=0;i<floatArray.length;i++)
				sum2=sum2+floatArray[i];
				{
			System.out.println(sum2);
				}
				System.out.println("left array");
			for(int i=(floatArray.length-1)/2;i>=0;i--)//left array
			{
				System.out.println(floatArray[i]);
			}
			System.out.println("right array");
			for(int i=(floatArray.length-1)/2;i<floatArray.length;i++)
			{
				System.out.println(floatArray[i]);//right array
			}
			
		System.out.println("Even array values");	
	for(int i=0;i<floatArray.length;i++)
		if(floatArray[i]%2==0)//even
		{
			System.out.println(floatArray[i]);
		}
		
		System.out.println("odd array values");
		for(int i=0;i<floatArray.length;i++)
		if(floatArray[i]%2!=0)//odd
	
	
	{
			System.out.println(floatArray[i]);
		
	}	
	
	
	//shortArray
	
	System.out.println("reverse of an array");
	short[] shortArray={(short)25000,(short)33000,(short)23000,(short)24000,(short)31000,(short)1452,(short)2451,(short)2365};
	for(int i=shortArray.length-1;i>=0;i--)
		{
		System.out.println(shortArray[i]);
		}
		
		System.out.println("sum of an array");
		int sum3=0;
			//int sum3=0; //sum of an array
			for(int i=0;i<shortArray.length;i++)
				sum3=sum3+shortArray[i];
				{
			System.out.println(sum3);
				}
				System.out.println("left array");
			for(int i=(shortArray.length-1)/2;i>=0;i--)//left array
			{
				System.out.println(shortArray[i]);
			}
			System.out.println("right array");
			for(int i=(shortArray.length-1)/2;i<shortArray.length;i++)
			{
				System.out.println(shortArray[i]);//right array
			}
			
		System.out.println("Even array values");	
	for(int i=0;i<shortArray.length;i++)
		if(shortArray[i]%2==0)//even
		{
			System.out.println(shortArray[i]);
		}
		
		System.out.println("odd array values");
		for(int i=0;i<shortArray.length;i++)
		if(shortArray[i]%2!=0)//odd
	
	
	{
			System.out.println(shortArray[i]);
		
	}	
	
	//intArray
	System.out.println("reverse of an array");
	int[] intArray={200000,300000,400000,55000,56358,23456,41526,1111};
	for(int i=intArray.length-1;i>=0;i--)
		{
		System.out.println(intArray[i]);
		}
		
		System.out.println("sum of an array");
		
			int sum4=0; //sum of an array
			for(int i=0;i<intArray.length;i++)
				sum4=sum4+intArray[i];
				{
			System.out.println(sum4);
				}
				System.out.println("left array");
			for(int i=(intArray.length-1)/2;i>=0;i--)//left array
			{
				System.out.println(intArray[i]);
			}
			System.out.println("right array");
			for(int i=(intArray.length-1)/2;i<intArray.length;i++)
			{
				System.out.println(intArray[i]);//right array
			}
			
		System.out.println("Even array values");	
	for(int i=0;i<intArray.length;i++)
		if(intArray[i]%2==0)//even
		{
			System.out.println(intArray[i]);
		}
		
		System.out.println("odd array values");
		for(int i=0;i<intArray.length;i++)
		
	if(intArray[i]%2!=0)//odd
	
	
	{
			System.out.println(intArray[i]);
		
	}	
	
	
}
}








