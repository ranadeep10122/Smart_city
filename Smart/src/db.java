import java.util.Scanner;


public class db 
{
	
	
 public static void main(String[] args)
 {
    display();
 }
 
	public static void display()
	{
	 Scanner inpt=new Scanner(System.in);
	 System.out.println("WELCOME TO KONOHA CITY");
	 System.out.println("CHOOSE ANY OPTION BELOW TO GET THE INFORMATION");
	 System.out.println("\n");
	 System.out.println("1. HOTELS");
	 System.out.println("2. TRANSPORT");
	 System.out.println("3. SHOPPING MALLS");
	 System.out.println("4. AIR TICKET BOOKING");
	 System.out.println("5. CITYNEWS");
	 System.out.println("ENTER ANY NUMBER FROM ABOVE TO GET INFORMATION");
	int a=inpt.nextInt();
	if(a>5)
	{
		System.out.println("WRONG INPUT");
		System.out.println("\n");
		display();
	}
	if(a<=5)
	{
		switch (a)
		{
		case 1:
		hotel m1= new hotel();	
		m1.hotels();
		break;
		
		case 2:
		transport m2=new transport();
		m2.transport();
		break;
		
		case 3:
		shopping m3=new shopping();
	    m3.shopping();
		break;
		
		case 4:
		ticket m4=new ticket();
		m4.airticket();
		break;
			
		case 5:
		news m5=new news();
		m5.citynews();
		break;
		}
	}
	
}
	
}

