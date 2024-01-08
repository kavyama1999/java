public class DebitCardRunner
{

public static void main(String args[])
{
DebitCard obj=new DebitCard("Smithan",125636857,25000,"orange",062,2028);

System.out.println("cardHolderName :" +obj.cardHolderName);
System.out.println("cardNumber : " +obj.cardNumber);
System.out.println(" balance: " +obj.balance);

System.out.println("color : " +obj.color);

System.out.println(" cvvNumber: " +obj.cvvNumber);

System.out.println("validity : " +obj.validity);


DebitCard.deposit();
DebitCard.withDraw();
DebitCard.activate();
DebitCard.Deactivate();
DebitCard.makingTransaction();
}

}

