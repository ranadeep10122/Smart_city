import java.util.Scanner;

public class news extends db
{
	public static void citynews()
	{
		Scanner rad=new Scanner(System.in);
		System.out.println("CHOOSE ANY OPTION BELOW TO GET THE INFORMATION");
		System.out.println("\n");
		System.out.println("1.INTERNATIONAL NEWS");
		System.out.println("2.LOCAL NEWS");
		System.out.println("3.SPORTS NEWS");
		System.out.println("4.POLITICAL NEWS");
		System.out.println("5.BUSINESS NEWS");
		System.out.println("ENTER 8 TO RETURN TO MAINMENU");
		int f=rad.nextInt();
		if(f<=5)
			switch(f)
			{
			case 1:
				System.out.println("INTERNATIONAL: GUIDELINES FOR INTERNATIONAL STUDENTS EN ROUTE TO CANADA ARE NOW AVAILABLE ON THE GOVERNMENT WEBSITE");
				{System.out.println("\n");
					System.out.println("Enter 0 to return to previous menu");
					int r=rad.nextInt();
					if (r<=0)
				citynews();}
				break;
			case 2:
				System.out.println("LOCAL: IN HYDERABAD GHMC POLLS SEE LOW VOTER TURNOUT");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=rad.nextInt();
				if (r<=0)
			citynews();}
				break;
			case 3:
				System.out.println("SPORTS: INDIA VS AUSTRALIA 3rd ODI LIVE CRICKET STREAMING");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=rad.nextInt();
				if (r<=0)
			citynews();}
				break;
			case 4:
				System.out.println("POLITICAL: KARNATAKA CM'S POLITICAL SECRETARY DENIES ATTEMPTING SUCIDE");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=rad.nextInt();
				if (r<=0)
			citynews();}
				break;
			case 5:
				System.out.println("BUSINESS: AMIRA NATURE FOODS WINS ASIAN BUSINESS AWARD");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=rad.nextInt();
				if (r<=0)
			citynews();}
				break;
			
		}
				
		if(f==8)
		{
			display();
		}
	
		
		
	}
}