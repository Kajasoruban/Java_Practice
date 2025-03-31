import packages.Dog;

public class Main {

    public static void main(String[] args)  {
        //throws ClassNotFoundException
        // System.out.println("Hello there!");
        Human kajan=new Human("kajan", 1000.00,"Zangetsu");
        Human ichigo=new Human("ichigo", 1000.00,"Zanku");
       // System.out.println(kajan);
       kajan.buyDog("shiny");
        
        // System.out.println(kajan.myDog);
        Dog.aging();
        // System.out.println(kajan.myDog.foodCapacity);

        // kajan.checkBalance();

        // kajan.myDog.bark();
        //  kajan.myDog.sound("woof woof woof..");
        //   System.out.println(kajan.myDog.foodCapacity);


        kajan.zanpakuto.askName(kajan);

        System.out.println(kajan.isShikaiUnlocked);

        kajan.increasePower(10.00,1);

        System.out.println(kajan.spiritualPowerLevel);


        // System.out.println(kajan+" "+ichigo);
         // System.out.println(kajan.equals(ichigo));

       //Class.forName("packages.Dog");

        //Widening Casting
        // int num4=2;
        // double num3=num4;

        //Narrowing Casting
        // double num4=2.0;
        // int num3=(int) num4;

        // System.out.println(num3);

        //  int[] exampleArray={1,2,3};
        //   System.out.println(Arrays.toString(exampleArray));

        // int[][] numbers = new int[5][2];
        // numbers[0][0]=5;
        // numbers[1]=new int[3];
        // numbers[4][1]=6;
        // System.out.println(Arrays.deepToString(numbers));


        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<numbers[i].length;j++){
        //         numbers[i][j]=j;
        //     }
        // }

        // System.out.println(Arrays.deepToString(numbers));

        // for(int[] n : numbers){
        //     for(int n2 : n){
        //     System.out.print(n2+", ");
        // }
        // }

        // StringBuffer des=new StringBuffer("example");
        // String desAsString=des.toString();
        // System.out.println(desAsString);
        // System.out.println(des.capacity());

        
    }
}
