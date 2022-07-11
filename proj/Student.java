package proj;

public class Student {
	String name;
	int sanskrit;
	int english;
	int maths;
	int physics;
	int chemistry;
	int getTotal() {
		return sanskrit+english+maths+physics+chemistry;
	}
	void printMarkSummery() {
		System.out.println("Total:"+getTotal());
	}
	void printMarkDetails() {
		System.out.println("sanskrit"+sanskrit);
		System.out.println("english"+english);
		System.out.println("maths"+maths);
		System.out.println("physics"+physics);
		System.out.println("chemistry"+chemistry);
	}
}
