package NewPack;
interface movie{
	void watch();
}
public class Lambda_eg{
	public static void main(String args[]) {
		int a=80;
		Lambda_eg objL= new Lambda_eg() {
			public void watch() {
				System.out.println("Movies"+a);
			}
		};
   }
}