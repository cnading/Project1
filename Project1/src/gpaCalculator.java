import java.util.ArrayList;


public class gpaCalculator
	{
		
		
		public static void getGradeAverage()
		{ 
		
			
			for(int i = 0; i <Runner.roster.size(); i++)
				{ 
					double gradeOneValue = calculateValue(Runner.roster.get(i).getFirstClassGrade()); 
					double gradeTwoValue = calculateValue(Runner.roster.get(i).getSecondClassGrade()); 
					double gradeThreeValue = calculateValue(Runner.roster.get(i).getThirdClassGrade()); 
					
					double sum = gradeOneValue + gradeTwoValue + gradeThreeValue; 
					
					double average = sum/3.0; 
					
					Runner.roster.get(i).setGradePointAverage(average);
				}
			

			
			
		}
		
		public static double calculateValue(String grade)
		{
			
			double letterValue = 0;  
			
			switch(grade) 
			{ 
				case "A":
				letterValue = 4.0; 
				break; 
				
				case "A+":
					letterValue = 4.3; 
					break;
					
				case "A-":
					letterValue = 3.7; 
					break;
				
				
				
				case "B": 
				letterValue = 3.0; 
				break; 
				
				case "B+": 
					letterValue = 3.3; 
					break; 
					
				case "B-": 
					letterValue = 2.7; 
					break; 
				
				case "C": 
				letterValue = 2.0; 
				break; 
				
				case "C+": 
					letterValue = 2.3; 
					break;
					
				case "C-": 
					letterValue = 1.7; 
					break;
				
				case "D": 
				letterValue = 1.0; 
				break; 
				
				case "D+": 
					letterValue = 1.3; 
					break; 
					
				case "D-": 
					letterValue = .7; 
					break; 
				
				case "F":
				letterValue = 0.0; 
				break; 
				
				case "F+":
					letterValue = 0.0; 
					break;
					
				case "F-":
					letterValue = 0.0; 
					break; 
								
			
			 
			}
			
			return letterValue; 
			
			
			
			
		
		 
		
			
			
		}

	}