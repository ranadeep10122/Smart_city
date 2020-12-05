import java.util.Scanner; 

  

public class transport extends db { 

  

        public static void transport() 

        { 

            Scanner reed=new Scanner(System.in); 

            System.out.println("CHOOSE ANY OPTION BELOW TO GET THE INFORMATION"); 

            System.out.println("\n"); 

            System.out.println("1. TAXI"); 

            System.out.println("2. CITY BUS "); 

            System.out.println("3. METRO "); 

            System.out.println("ENTER 0 TO RETURN TO MAINMENU"); 

            int c=reed.nextInt(); 

            if(c<=3) 

                switch (c) 

            { 

                case 1: 

                      System.out.println("TAXI NEARBY ME"); 

                      System.out.println("Driver Name: John \n Taxi no.: MT9997S \n Location: Rue Saint -Mathieu\n Fare: $5.50/km "); 

                    System.out.println("2. Driver Name: Sam \n Taxi no.: QC1067E \n Location: Rue Saint-catherine\n Fare: $5.50/km "); 

                    System.out.println("3. Driver Name: Kim \n Taxi no.: CA2344N \n Location: Rue Guy \n Fare: $5.50/km"); 

                   { System.out.println("\n"); 

                    System.out.println("Enter 0 to return to previous menu"); 

                    int t=reed.nextInt(); 

                    if (t<=0) { 

                    transport ();}} 

                    break; 

                case 2: 

                    System.out.println("Bus no.:33-N\n Timing:10:30 am \n Starting: Langelier station   Ending: Langelier Dumesnil\n Fare: $6.50"); 

                    System.out.println("Bus no.:78-E\n Timing:11:40 am \n Starting: Angrinon Ending: Cordner/Lapierre \n Fare: $6.50"); 

                    System.out.println("Bus no.:46-S\n Timing:8:00 am \n Starting: St. Louis/Gohier   Ending: Rue Hickmore\n Fare: $6.50"); 

                    System.out.println("\n"); 

                    System.out.println("Enter 0 to return to previous menu"); 

                    int t=reed.nextInt(); 

                    if (t<=0) { 

                    transport();} 

                    break; 

                case 3: 

                    System.out.println("Track: Green \n Starting: Angrinon  Ending: Honore-Beaugrand \n Fare: $6.50"); 

                    System.out.println("Track: Orange \n Starting: Cote-Vertu Ending: Montmorency\n Fare: $6.50"); 

                    System.out.println("Track: Blue \n Starting: Snowdown   Ending: Saint- Michel\n Fare: $6.50"); 

                    System.out.println("Track: Yellow \n Starting: Berri-UQAM   Ending: Longueuil-Universite de Sherbrooke \n Fare: $6.50"); 

                    {  System.out.println("\n"); 

                    System.out.println("Enter 0 to return to previous menu"); 

                    int r= reed.nextInt();

                    if (r<=0) { 

                    transport();} }

                    break; 
            }
            if(c==0) 

            { 

                display(); 

            } }}

            
        
