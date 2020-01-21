import java.util.Comparator;
import java.util.Scanner;

public class sortStudentsPeriod implements Comparator<Student>
	{
		static Scanner userInput = new Scanner(System.in);
		static int sortChoice = 0;

	@Override
	public int compare(Student s1, Student s2)
		{
			if(sortStudentsMenu.sortChoice == 1)
				{
				return s1.getFirstClass().compareTo(s2.getFirstClass());
				}
			else if(sortStudentsMenu.sortChoice == 2)
				{
					return s1.getSecondClass().compareTo(s2.getSecondClass());
				}
			else
				{
					return  s1.getThirdClass().compareTo(s2.getThirdClass());
				}
	
					
		}	

	}
