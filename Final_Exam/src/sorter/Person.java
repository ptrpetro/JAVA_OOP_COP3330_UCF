package sorter;

public class Person implements Comparable<Person>{
	private String name;
	private String dpt;
	private Integer salary;
	
	// no arg constructor with my pref. values
	private Person() {
		this.name = "tmpName";
		this.dpt = "tmpDpt";
		this.salary = null;
	}
	
	//constructor with String input from data.txt
	public Person(String line) {
		String[] arr = line.split(" ");
		name = arr[0];
		salary = Integer.parseInt(arr[1]);
		dpt = arr[2];
	}
	
	//getter and setter methods for each instance variables
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDpt(String dpt2Set) {
		this.dpt = dpt2Set;
	}
	
	public void setSalary(Integer salary2Set) {
		this.salary = salary2Set;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDpt() {
		return this.dpt;
	}	
	
	public Integer getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return this.getName() + "," + this.getSalary() + "," + this.getDpt() + "\n";
	}
	
	public int compareTo(Person p) {
		return Integer.compare(salary, p.salary);
	}
	
}
