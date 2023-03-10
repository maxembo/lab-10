import java.util.*;

public class Course {

	public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	private Collection<Lecturer> teaches;
	private String name;
	private int id;
	private float hours;

	public Collection<Lecturer> getTeaches() {
		return teaches;
	}

	public void setTeaches(Collection<Lecturer> teaches) {
		this.teaches = teaches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public void addStudent(){
		System.out.println("You added a student");
	}

	public void setCountOfHours(){
		System.out.println("Success");
	}
}