package DAY6;

public class Student {
	
	private String name;
	private int rollno;
	private String section;
	private Subject subject;
	private School school;
	public Student() {
		super();
	}
	public Student(String name, int rollno, String section, Subject subject, School school) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
		this.subject = subject;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + ", subject=" + subject
				+ ", school=" + school + "]";
	}
	
	
	
}
