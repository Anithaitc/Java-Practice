//Tricycle class
public class Tricycle extends Bike1{
 String name;
 public Tricycle(String name,String color){
  this.name=name;
 }
 public Tricycle(){
  
 }
 @Override
  void makeNoise(){
   System.out.println("ting!");
  }
}