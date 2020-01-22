import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 

public class sortStudentsMenu
	{
		static Scanner userInput = new Scanner(System.in);
		static int sortChoice = 0;
		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void intro()
		{
			System.out.println("What would you like to do?");
			
			 System.out.println("1) sort by last name "
			 		+ "\n2) sort by GPA "
			 		+ "\n3) sort by period "
			 		+ "\n4) return to main menu");
			 
			 sortChoice = userInput.nextInt();
			 if (sortChoice == 1)
				 {
					 sortNames();
				 }
			 else if (sortChoice == 2)
				 {
					 sortGpa();
				 }
			 else if (sortChoice == 3)
				 {
					 sortPeriod();
				 }
			 else
				 {
					 Runner.intro();
				 }
				 
		}
		
		public static void sortNames()
		{
			 
			
				Collections.sort(Runner.roster, new sortStudentNames());

				 Runner.printRoster();
				 
				 System.out.println();
				 intro();

				
				 
		}
		
		public static void sortGpa()
		{
			
			  
					 Collections.sort(Runner.roster, new sortStudentGpa());

					 System.out.println();
					 intro();
		}
		
		public static void sortPeriod()
		{
			
					 Collections.sort(Runner.roster, new sortStudentsPeriod());

					Runner.printRoster(); 

					System.out.println();
					intro();
		}
			        
					
					
				 
			 
			
			 
			
		

	}
