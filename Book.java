public class Book{

String bookName;
int noOfPages;
String author;
int price;
int publishedYear;
String publisher;
String type;


Book(String bookName,int noOfPages,String author,int price,int publishedYear,String publisher,String type)
{
this.bookName=bookName;
this.noOfPages=noOfPages;
this.author=author;
this.price=price;
this.publishedYear=publishedYear;
this.publisher=publisher;
this.type=type;
}


public void printAll()

{
	
	System.out.println("BookName : "+this.bookName);
	System.out.println("Noofpages :" +this.noOfPages);
	System.out.println("Author Name: " +this.author);
	System.out.println("Price: " +this.price);
	System.out.println("PublishedYear :" +this.publishedYear);
	System.out.println("Publisher: " +this.publisher);
	System.out.println("Type :" + this.type);
	
	
}


public static void main(String args[])
{
	Book obj=new Book("The Indian Story",250,"Gaurav Sharma",300,1998,"Think Tank","Adventure");
	obj.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj1=new Book("Ramayana",1700,"Valmiki",3000,1996,"Bharatiya Vidya Bhavan","Itihasa");
	obj1.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj2=new Book("The Sea Runners",288,"Ivan Doigs",1266,1982,"Scribner","Winter Adventure");
	obj2.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj3=new Book("The lord of the Rings",288,"Ivan Doigs",1266,1982,"Scribner","Winter Adventure");
	obj3.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj4=new Book("The Hobbit", 310, "J.R.R. Tolkien", 1575, 1937, "Allen & Unwin", "Fantasy");
	obj4.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj5=new Book("History Of Adventure",500,"H.Rider Haggard",456,1886,"Longmans","Novels");
	obj5.printAll();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	Book obj6=new Book("The Hunger Games", 374, "Suzanne Collins", 1349, 2008, "Scholastic Corporation", "Science Fiction");
	obj6.printAll();

	}
}