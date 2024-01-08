public class DebitCard
{
//states

String cardHolderName;
int cardNumber;
int balance;
String color;
int cvvNumber;
int validity;

DebitCard(String cardHolderName,int cardNumber,int balance,String color,int cvvNumber,int validity)
{
this.cardHolderName=cardHolderName;
this.cardNumber=cardNumber;
this.balance=balance;
this.color=color;
this.cvvNumber=cvvNumber;
this.validity=validity;
}


//void display()
//{
	
	
//}
//Behaviours

static void deposit()
{
	
	System.out.println("Deposit");
}
static void withDraw()
{
	System.out.println("Draw  Money");
}

static void activate()
{
	System.out.println("Is activate");
}
static void Deactivate()
{
	System.out.println("Is Deactivate");
}
static void makingTransaction()
{
	System.out.println("makingTransaction");
}

}