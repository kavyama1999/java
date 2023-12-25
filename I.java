public class L {
    
    int price;
    static String color;
    
    L(int price, String color) {
        this.price = price;
        this.color = color;
    }
    
    public static void main(String args[]) 
	{
        L obj = new L(20, "brown");
        System.out.println(obj.price);
        System.out.println(obj.color);
    }
}
