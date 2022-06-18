//method overriding class2
public class Bike_O extends Vehicle_O{
 String name;
 @Override
 void run(){
  System.out.println("My"+this.name+"is running");
 }
}