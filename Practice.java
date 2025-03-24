import packages.Dog;

class Human{
    String name;
    double bankBalance;
    Dog myDog;

    public Human(String name, double money){
        this.name=name;
        bankBalance = bankBalance + money;
       // System.out.println(bankBalance);
    }

    public void withDraw(double money){
        bankBalance = bankBalance - money;
       // System.out.println(bankBalance);
    }

    public void buyDog(String name){
        myDog=new Dog(name);
        withDraw(myDog.price);
    }

    @Override
   public String toString(){
    return "name: "+ name +", bankBalance: "+bankBalance;
   }
    
}