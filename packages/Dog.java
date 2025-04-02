package packages;

class Animal{
    protected  int foodCapacity=400;
    protected String tone="";

    public Animal(){
     // System.out.println("animal class used..");
      foodCapacity -= 100;
    }

    //can't be override in subclass
    final public void sound(){
    //  System.out.println(tone);
       foodCapacity -= 100;
       if(foodCapacity<=100){
        System.out.println("hungry");
       }
    }

}

public class Dog extends Animal{
    String name;
    public final double price=10.0;
    private  static int age=1;

    public Dog(){
      //without param
      super();
      tone="woof woof woof..";
    //  System.out.println("dog class used without param..");
    }

    public Dog(String dogName){
      this();
     //  System.out.println("dog class used..");
      name=dogName;
      //System.out.println(name);
    }

     public void bark(){
       super.sound();
    }

  //  static {
  //   System.out.println("class loaded");
  //  }

   public static void aging(){
    age++;
    
   }

    
    

      @Override
   public String toString(){
    return name;
   }
}