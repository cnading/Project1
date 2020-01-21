import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ChangeStudentGradeSchedule
	{
		
		public static void IntroForGradeAndScheduleChange()
			{
				
				Scanner userInput = new Scanner(System.in);
				System.out.println(" Hello, would you like to (1) change Grades or (2) Change Schedule?");
				
				boolean studentList = true ;
				while(studentList) {
				int catagory = userInput.nextInt(); 
				if(catagory == 1)
					{
						
						changeGrades();
						studentList = false;
					}
				else if( catagory == 2)		
					{
						switchClasses();
						studentList = false; 
					}
				
				else 
					{
						System.out.println("Please pick either 1 or 2.");
						
					}
				}
			
			} 
		
		public static void changeGrades()
		{
	Scanner userInput = new Scanner(System.in); 		
	
	System.out.println("Okay, here are all of the students: ");
			
			Runner.printRoster(); 

	System.out.println("Please enter the first name of a student to change their grades");
	
	String chosenStudentName = userInput.next(); 
	
	for(Student s: Runner.roster)
		{ 
			
		}
	
		}
	
		
		
		
		
		
		
		

		
//Clancy: line 70
		public static void switchClasses()
		{
			
			System.out.println("Okay, here are all of the students: ");
			
			Runner.printRoster(); 
			
			//Scanner userInputString = new Scanner(System.in); 
			
			//String chosenStudentFirstName = userInputString.nextLine(); 
			
			
			
			
		}
		
		
	}
