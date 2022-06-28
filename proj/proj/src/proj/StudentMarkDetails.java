package proj;

public class StudentMarkDetails {
	public static void main(String args[]) {
		Student s= new Student();
		s.name="Anitha";
		s.sanskrit=99;
		s.english=78;
		s.maths=75;
		s.physics=55;
		s.chemistry=45;
		System.out.println("Detailed marks:");
		s.printMarkDetails();
		System.out.println("Summery marks:");
		s.printMarkSummery();
		System.out.println("");		
	}
}
