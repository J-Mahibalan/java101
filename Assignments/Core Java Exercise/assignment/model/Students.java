package assignment.model;

public class Students {
	private Integer id;
	private String name;
	private String city;
	
//	Default Constructor
	public Students() {
		
	}
//	Parameter-ised Constructor

	public Students(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
//	Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
//	toString()

	@Override
	public String toString() {
		return "\nStudents [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
