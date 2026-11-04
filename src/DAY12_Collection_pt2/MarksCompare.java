package DAY12_Collection_pt2;
import java.util.*;
import java.util.Comparator;

public class MarksCompare implements Comparator<Student> {

	//Comparator → uses compare(T o1, T o2)
	//Comparable → uses compareTo(T o)v

	@Override
	public int compare(Student s1, Student s2) {
		
		//compare Percentage in Descending order!
		if(s1.getPercentage()>s2.getPercentage()) {  //getRoll is used to access Private Variable
			return -1;
		}
		else if(s1.getPercentage()<s2.getPercentage()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
