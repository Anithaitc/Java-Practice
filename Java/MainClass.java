// hierarchy inheritence

//Mainclass
public class MainClass{
 public static void main(String args[]){
  Vehicle vehicle=new Vehicle();  
  Bike bike= new Bike();
  Tricycle1 tricycle=new Tricycle1();
  bike.name="BMW";
  bike.color="Blue";
  tricycle.name="fox";
  tricycle.color="Green";
  System.out.println("Bike name:"+bike.name);
  System.out.println("Bike color:"+bike.color);
  vehicle.makeNoise();
  bike.makeNoise();
  tricycle.makeNoise();
  System.out.println("Tricycle1 name:"+tricycle.name);
  System.out.println("Tricycle1 color:"+tricycle.color);
 }
}