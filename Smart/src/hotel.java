import java.util.Scanner;

class hotel extends db
 {public static void hotels()
	{
		
		Scanner feed=new Scanner(System.in);
		System.out.println("CHOOSE ANY OPTION BELOW TO GET THE INFORMATION");
		System.out.println("\n");
		System.out.println("1.PARK INN");
		System.out.println("2.ADITYA PARK HOTEL");
		System.out.println("3.PARK HYATT");
		System.out.println("4.ITC KOHEUR");
		System.out.println("ENTER 0 TO RETURN TO MAINMENU");
		int b=feed.nextInt();
		if(b<=4)
			switch (b)
		{
			case 1:
				System.out.println("Aditya Trade Center, Satyam Theatre Rd, opp. Aster Prime Hospital, Ameerpet, Hyderabad, Telangana 500038• \n contact: 1040 6678 8888 \n website:https://www.radissonhotels.com/en-us/brand/park-inn");
				
				{System.out.println("\n");
					System.out.println("Enter 0 to return to previous menu");
					int r=feed.nextInt();
					if (r<=0)
				hotels();}
				break;
			case 2:
				System.out.println("Aditya Trade Center, Satyam Theatre Rd, opp. Aster Prime Hospital, Ameerpet, Hyderabad, Telangana 500038• \n contact:040 6678 8888.\n website: https://www.sarovarhotels.com/aditya-park-hyderabad/");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=feed.nextInt();
				if (r<=0)
			hotels();}
				break;
			case 3:
				System.out.println("Road Number 2, Sri Nagar Colony, Kamalapuri Colony, Banjara Hills, Hyderabad, Telangana 500034• \n contact:040 4949 1234. \n website:https://www.hyatt.com/en-US/hotel/india/park-hyatt-hyderabad/hydph?src=corp_lclb_gmb_seo_hydph");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=feed.nextInt();
				if (r<=0)
			hotels();}
				break;
			case 4:
				System.out.println("Knowledge City, Plot No.5, Survey No. 83/1 Survey No.83/1, Hyderabad, Madhapur, Telangana 500081• \n contact:040 6766 0101. \n website:https://www.marriott.com/hotels/travel/hydlk-itc-kohenur-a-luxury-collection-hotel-hyderabad/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_OTY3MTkzMy03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU=");
				{System.out.println("\n");
				System.out.println("Enter 0 to return to previous menu");
				int r=feed.nextInt();
				if (r<=0)
			hotels();}
				break;
			
		}
		if(b==0)
		{
			display();
		}
	}

}
