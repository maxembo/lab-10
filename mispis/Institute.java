public class Institute {

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String name;
    private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addNewFaculty(){
		System.out.println("Faculty was add");
	}

	public void closeFaculty(){
		System.out.println("Faculty was close");
	}
}