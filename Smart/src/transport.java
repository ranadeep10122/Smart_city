import java.util.Scanner;

public class transport extends db{	
	public static void transport()
	{
		Scanner reed=new Scanner(System.in);
		System.out.println("CHOOSE ANY OPTION BELOW TO GET THE INFORMATION");
		System.out.println("\n");
		System.out.println("1.TAXI");
		System.out.println("2.CITY BUS ");
		System.out.println("3.METRO ");
		System.out.println("ENTER 0 TO RETURN TO MAINMENU");
		int c=reed.nextInt();
		if(c<=3)
			switch (c)
		{
			case 1:
				System.out.println(" SERVICE: 99999");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=reed.nextInt();
				if (r<=0)
			transport();}
			case 2:
				System.out.println("FOR EVERY 5 MINUTES");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=reed.nextInt();
				if (r<=0)
			transport();}
				break;
			case 3:
				System.out.println("FOR EVERY 8 MINUTES");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=reed.nextInt();
				if (r<=0)
			transport();}
				break;
			
			
		}
		if(c==0)
		{
			display();
		}
		
	}
}
