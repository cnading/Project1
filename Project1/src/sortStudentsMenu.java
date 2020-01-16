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
				Collections.sort(Runner.roster, new sortStudentNames());

				 Runner.printRoster();

				
				 }
			 else if (sortChoice == 2)
				 {
					 Collections.sort(Runner.roster, new sortStudentGpa());

				 }
			 else if (sortChoice == 3)
				 {
					 Collections.sort(Runner.roster, new sortStudentsPeriod());

					 Runner.printRoster();
				 }
			 else if (sortChoice == 3)
				 {
					Collections.sort(Runner.roster, new sortStudentsPeriod());
					Runner.printRoster(); 

				 }
			 else
				 {
					 Runner.intro();
					 Runner.printRoster(); 
				 }
			 
			
			 
			
		}

	}
