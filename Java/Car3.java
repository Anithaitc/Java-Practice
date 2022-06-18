//parameterised constructor
public class Car3{
 String name;
 Car3(String name){
  this.name=name;
 }
 public static void main(String args[]){
  Car3 carObj1=new Car3("BMW");
  System.out.println(carObj1.name);
  Car3 carObj2=new Car3("Honda");
  System.out.println(carObj2.name);
 }
}