package suraj_pkg;

import java.util.Comparator;

public class RollnoProgram10 implements Comparator<Program10> {

	@Override
	public int compare(Program10 o1, Program10 o2) {
		if(o1.rollno==o2.rollno)
		return 0;
		else if(o1.rollno>o2.rollno)
		return 1;
		else
		return -1;
	}

}
