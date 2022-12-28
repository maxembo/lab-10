import java.util.Date;

public class Project {

	private String name;
	private Date start;
	private Date end;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public static void startProject(){
		System.out.println("Project started");
	}

	public static void finishProject(){
		System.out.println("Project finished");
	}

	public static void freezeProject(){
		System.out.println("Project frozen");
	}

	public static void unFreezeProject(){
		System.out.println("Project unfrozen");
	}
}