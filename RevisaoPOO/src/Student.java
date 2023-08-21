
public class Student extends User {
	
	private int enrolment; //matricula
	private String course; //curso
	private short semester;//semestre
	
	
	public Student(int idUser, int enrolament){//chamada do construtor da classe mãe
		super(idUser);
		this.enrolment = enrolament;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public short getSemester() {
		return semester;
	}


	public void setSemester(short semester) {
		this.semester = semester;
	}


	public int getEnrolment() {
		return enrolment;
	}

	public String formatPersonalData() {
		String userData = super.formatPersonalData();
		String studentData = String.format("\nRA: %s\nCurso: %s\nPeriodo: %d\n", this.enrolment, this.course, this.semester);
		return userData + studentData;
	}

	
}
