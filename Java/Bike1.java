/Bike class
public class Bike1 extends Vehicle{
 String name;
 public Bike(String name,String color){
  this.name=name;
 }
 public Bike(){

 }
 @Override
  void makeNoise(){
   System.out.println("peeeeeeeeep!");
  }
}
