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

class SoulReaper{
    Zanpakuto zanpakuto;
    boolean isShikaiUnlocked=false;
    boolean isBangaiUnlocked=false;
    double spiritualPowerLevel=0;

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
    return "equal";
    //return "name: "+ name +", bankBalance: "+bankBalance;
   }
    
}

// public class Practice{

//  public static void main(String[] args) throws ClassNotFoundException {
//         Class.forName("packages.Dog");
//     }
// }