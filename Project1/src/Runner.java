import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				// TODO Auto-generated method stub
				
				
			//	Scanner file = new Scanner(new File ("studentInfo.txt"));
		//		System.out.println(file);
				sortStudents.sortByLastName();
				sortStudents.sortByGpa();
				sortStudents.sortByPeriod();

			}

	}
