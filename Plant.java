

public class Plant{
	
	
	//static String plantName;
	//static String color;
	Plant()
	{
		this("Hibiscus");
		System.out.println("No parameters");
	}
	
	Plant(String plantName)
	{
		this((byte)5);
		System.out.println("PlantName: "+plantName );
	}
	
	
	
	Plant(byte height)
	{
		this(6.5f);
		System.out.println("Height :" +height);
	}
	
	Plant(float phValue)
	{
		//this("Red");
		System.out.println("PhValue :" +phValue);
	}
	
	//Plant(String color)
	//{
		//System.out.println("color :"+color);
	//}
	
	
	public static void main(String arguments[])
	{
		new Plant();
	}
	}