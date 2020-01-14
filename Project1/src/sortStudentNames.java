import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Comparator;

public class sortStudentNames implements Comparator<Student>
	{
	
		@Override
		public int compare(Student s1, Student s2)
			{
				
				return s1.getLastName().compareTo(s2.getLastName());
			}


	}
