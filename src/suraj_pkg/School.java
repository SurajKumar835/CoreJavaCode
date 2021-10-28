package suraj_pkg;

import java.io.Serializable;

public class School implements Serializable{
	public static final long serialVersionUID=1234568989L;
	public String name;
	public int SchoolNo;
	transient int roadNo;
	public School(String name, int schoolNo, int roadNo) {
		this.name = name;
		this.SchoolNo = schoolNo;
		this.roadNo = roadNo;
	}
	
}
