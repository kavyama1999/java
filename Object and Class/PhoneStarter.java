public class PhoneStarter
{

public static void main(String[] args)
 {
  Phone phone = new Phone("ViVo 29 Pro",256,"Blue",40000,"Smart phone",true);
  phone.displayInformation();
  
  phone.make_call();
  phone.send_message();
  phone.make_videoCall();
  
 }
 }