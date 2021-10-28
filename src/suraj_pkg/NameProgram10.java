package suraj_pkg;

import java.util.Comparator;

public class NameProgram10 implements Comparator<Program10> {

	@Override
	public int compare(Program10 o1, Program10 o2) {
		return o1.name.compareTo(o2.name);
	}

}
