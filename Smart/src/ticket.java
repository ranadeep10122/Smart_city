import java.util.Scanner;

public class ticket extends db 
{
	public static void airticket()
	{
		String name="null";
		String contact="null";
		Scanner red=new Scanner(System.in);
		System.out.println("Welcome to the Online Booking Portal of Airline Ticket... ");
		System.out.println();
		System.out.println("PLease Select your Airlines");
		System.out.println("1. Sky Travles");
		System.out.println("2. Tourist Travles");
		System.out.println("3. Global Travles");
		int in = red.nextInt();
		while(in>3 | in<1)
		{
			System.out.println("Please Enter Correct Option");
			in = red.nextInt();
		}
		if(in==1) {
			name = "Sky";
		    contact ="514 856 4578";
		}
		else if(in==2) {
			name = "Tourist";
			contact ="514 321 8521";
		}
		else if(in==3) {
			name = "Global";
			contact ="514 456 1155";			
		}
		System.out.println("Welcome to "+name+" Travels...");
		System.out.println();
		System.out.println("Here is the Info all u need...");
		System.out.println();
		System.out.println("Contact : "+contact);
		System.out.println("Email   : "+name.toLowerCase()+"@gmail.com");
		System.out.println("Website : http://"+name+".com/");
		System.out.println("Now, You can just book your ticket for desired destinations through phone.");
		System.out.println("Thank You.");
	
		System.out.println("ENTER 0 TO RETURN TO MAINMENU");
		int e=red.nextInt();
		while(e!=0)
		{
			System.out.println("Invalid Input, Please enter 0 to go back:");
			e=red.nextInt();
		}
		if(e==0)
		{
			display();
		}	
		red.close();
	}
}
