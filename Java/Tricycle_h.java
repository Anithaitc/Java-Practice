//Heirarchy Tricycle class
public class Tricycle1 extends Vehicle{
 String name;
 public Tricycle1(String name,String color){
  this.name=name;
 }
 public Tricycle1(){
  
 }
 @Override
  void makeNoise(){
   System.out.println("ting!");
  }
}