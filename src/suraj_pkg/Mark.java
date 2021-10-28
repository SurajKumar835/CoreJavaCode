package suraj_pkg;

public class Mark implements Comparable<Mark> {
		private String name;
		private int age;
		Mark(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
		
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	@Override
	public int compareTo(Mark o) {
		if(age==o.age)
		return 0;
		else if(age>o.age)
		return 1;
		else 
		return -1;
	}

}
