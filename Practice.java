import packages.Dog;





//cannot be inherited
final class Zanpakuto{
    //constant value
    final private String name;
    

    public Zanpakuto(String name){
        this.name=name;
    }

    protected void askName(SoulReaper obj){
        System.out.println("Your zanpakuto's name is "+name);
       obj.unlockShikai();
    }

}

abstract class Hollow{ //can't directly use to create object first it's abstract methods should be implemented in a class and then we can use it

   abstract public void increaseSpeed(SoulReaper ob);
   abstract public void increaseStrength(SoulReaper ob);

}

class Vizard extends Hollow{

    @Override
    public void increaseSpeed(SoulReaper ob) {
        ob.speedLevel+=5;
    }

    
    @Override
    public void increaseStrength(SoulReaper ob) {
          ob.strengthLevel+=5;
    }

}

class SoulReaper extends Vizard{
    Zanpakuto zanpakuto;
    boolean isShikaiUnlocked=false;
    boolean isBangaiUnlocked=false;
    double spiritualPowerLevel=0;
    double healthLevel=100.00;
    double speedLevel=10;
    double strengthLevel=5;

    public SoulReaper(String name){
        zanpakuto=new Zanpakuto(name);
        spiritualPowerLevel=10.00;
    }

    protected void unlockShikai(){
          isShikaiUnlocked=true;
    }

     protected void unlockBangai(){
          isBangaiUnlocked=true;
    }

     protected void increasePower(double level){
          spiritualPowerLevel=level;
    }

}


class Human extends SoulReaper{
    String name;
    private double bankBalance;
    Dog myDog;
    

    // static {
    //     System.out.println("class loaded");
    // }

    public Human(String name, double money,String zanpakutoName){
        super(zanpakutoName);
        this.name=name;
        bankBalance = bankBalance + money;
       // System.out.println(bankBalance);
    }

    // run time polymorphism (method overwriting) use dynamic binding
    @Override
    protected void increasePower(double level){
          spiritualPowerLevel=spiritualPowerLevel+level;
    }

     // compile time polymorphism (method overloading) use static binding
     protected void increasePower(double level, int bonus){
          spiritualPowerLevel=spiritualPowerLevel+level+bonus;
    }

    public void withDraw(double money){
        bankBalance = bankBalance - money;
       // System.out.println(bankBalance);
    }

   public void checkBalance(){
    System.out.println(bankBalance);
    }


    public void buyDog(String name){
        myDog=new Dog(name);
        withDraw(myDog.price);
    }
    

   

    @Override
   public String toString(){
    //return "equal";
    return "{name: "+ name +", bankBalance: "+bankBalance+"}";
   }
    
}

// public class Practice{

//  public static void main(String[] args) throws ClassNotFoundException {
//         Class.forName("packages.Dog");
//     }
// }