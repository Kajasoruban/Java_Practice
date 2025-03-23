
class Human{
    String name;
    double bankBalance;

    public Human(String name, double money){
        this.name=name;
        bankBalance = bankBalance + money;
       // System.out.println(bankBalance);
    }

    @Override
   public String toString(){
    return "name: "+ name +", bankBalance: "+bankBalance;
   }
    
}