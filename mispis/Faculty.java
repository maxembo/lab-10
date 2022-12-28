public class Faculty {

	private Employee dean;
	private String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void holdOpenDay(){
		System.out.println("You held an open day");
	}

	public void findPartners(){
		System.out.println("You found partners");
	}
}