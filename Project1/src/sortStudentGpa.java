import java.util.Comparator;

public class sortStudentGpa implements Comparator<Student>
	{

	@Override
	public int compare (Student s1, Student s2)
		{
			if (s1.getGradePointAverage() < s2.getGradePointAverage())
				{
					return 1;
				}
			else
				{
					return -1;
				}
		}

	}
