
public class Main {

	public static void main(String[] args) {
		Student sabrina = new Student(1, 8);
		sabrina.setName("Sabrina");
		sabrina.setBirthDate("28/06/2004");
		sabrina.setCourse("SI");
		sabrina.setSemester((short)4);
		
		Professor emerson = new Professor(2,"217");
		emerson.setName("Emerson");
		emerson.setLevel("Doutor");
		emerson.setArea("Informática");
		
		AT ju = new AT(3, "891");
		ju.setName("Julia");
		ju.setArea("TI");
		ju.setRole("Técnica em Laboratório");
		
		printUserData(sabrina);
		printUserData(emerson);
		printUserData(ju);
		

	}
	
	private static void printUserData(User user){
		System.out.println(user.formatPersonalData());
	}

}
