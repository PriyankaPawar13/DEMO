package DAY6;

public class Subject {
	
	private String subName;
	private String SubCode;
	
	public Subject() {
		super();
	}
	
	public Subject(String subName, String subCode) {
		super();
		this.subName = subName;
		SubCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubCode() {
		return SubCode;
	}

	public void setSubCode(String subCode) {
		SubCode = subCode;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", SubCode=" + SubCode + "]";
	}

	
	

}
