import java.util.Scanner;

public class shopping extends db {
	public static void shopping()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("1. FORUM MALL");
		System.out.println("2. GSM MALL");
		System.out.println("3. GVK MALL");
		System.out.println("ENTER 0 TO RETURN TO MAINMENU");
		int b=read.nextInt();
		if(b<=3)
			switch (b)
		{
			case 1:
				System.out.println("1. FORUM MALL");
				System.out.println("Address: K P H B Phase 9, Kukatpally, Hyderabad, Telangana 500085");
				{System.out.println("\n");
					System.out.println("Enter 0 to return to previous menu");
					int r=read.nextInt();
					if (r<=0)
				shopping();}
				break;
				
			case 2:
				    System.out.println("2. GSM MALL");
					System.out.println("Address: Miyapur Main Rd, ICRISAT Colony, Madeenaguda, Telangana 500050");
					{System.out.println("\n");
					System.out.println("Enter 0 to return to previous menu");
					int r=read.nextInt();
					if (r<=0)
				shopping();}
					break;
					
			case 3:
				    System.out.println("3. GVK MALL");
					System.out.println("Address: Rd Number 1, Balapur Basthi, Banjara Hills, Hyderabad, Telangana 500034");
					{System.out.println("\n");
					System.out.println("Enter 0 to return to previous menu");
					int r=read.nextInt();
					if (r<=0)
				shopping();}
					break;
		
		
	}

}
}
