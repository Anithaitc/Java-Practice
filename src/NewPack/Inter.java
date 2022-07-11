//lambda example
package NewPack;
interface Vehicle{
	public void sound();
}
public class Inter {
	public static void main(String args[]) {
		/*Bike objB=new Bike();
		objB.sound();*/
		String s= "peeep....!";
		Vehicle v1=()->{
			System.out.println("Vehicle making sound:"+s);
		};
		v1.sound();
	}

}
