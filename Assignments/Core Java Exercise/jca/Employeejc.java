package jca;

public class Employeejc {
	private Integer eId;
	private String eName;
	private String eCity;
	
	public Employeejc() {
		
	}

	public Employeejc(Integer eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	@Override
	public String toString() {
		return "Employeejc [eId=" + eId + ", eName=" + eName + ", eCity=" + eCity + "]";
	}
	
}
