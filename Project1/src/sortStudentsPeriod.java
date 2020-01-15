import java.util.Comparator;

public class sortStudentsPeriod implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			
			return s1.getFirstClass().compareTo(s2.getFirstClass()) +
			s1.getSecondClass().compareTo(s2.getSecondClass()) +
			 s1.getThirdClass().compareTo(s2.getThirdClass());
			
		}

	}
