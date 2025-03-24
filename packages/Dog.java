package packages;

public class Dog{
    String name;
    public final double price=10.0;
    public Dog(String dogName){
      name=dogName;
      //System.out.println(name);
    }

      @Override
   public String toString(){
    return name;
   }
}