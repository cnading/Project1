import java.io.*;
import java.util.Scanner;


public class fileReader 
	{
		
		public static void readStudentFile() throws FileNotFoundException
		{ 
			Scanner file = new Scanner(new File("studentInfo.txt")); 
			
			while(file.hasNext())
				{
					
					String currentStudent = file.nextLine(); 
					String[] currentStudentInformation = currentStudent.split(" "); 
					
				
					String firstName = currentStudentInformation[0]; 
					
					String lastName = currentStudentInformation[1]; 
					
					String firstClass = currentStudentInformation[2]; 
					
					String firstClassGrade = currentStudentInformation[3]; 
					
					String secondClass = currentStudentInformation[4]; 
					
					String secondClassGrade = currentStudentInformation[5]; 
					
					String thirdClass = currentStudentInformation[6]; 
					
					String thirdClassGrade = currentStudentInformation[7]; 
					
					
					Runner.roster.add((new Student(firstName, lastName, firstClass, firstClassGrade, secondClass, secondClassGrade, thirdClass, thirdClassGrade, 0.0))); 
				}
			
			for(Student s: Runner.roster)
				{ 
					System.out.println(s.getFirstName()); 
				}
		
		}
		
	}
