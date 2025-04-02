import packages.Dog;





public class Main {

   //inner class can use static
   static class Sub{//implementation of javascript console.log()
        
        public void log(byte data){
            System.out.println(data); 
        }
        public void log(short data){
            System.out.println(data); 
        }
        public void log(int data){
            System.out.println(data); 
        }
        public void log(long data){
            System.out.println(data); 
        }
        public void log(float data){
            System.out.println(data); 
        }
        public void log(double data){
            System.out.println(data); 
        }
        public void log(boolean  data){
            System.out.println(data); 
        }
        public void log(char  data){
            System.out.println(data); 
        }
        public void log(String  data){
            System.out.println(data); 
        }
        public void log(Object  data){
            try {
            
            data.getClass().getMethod("toString");
            System.out.println(data.toString()); 
                
            } catch (Exception e) {
                //System.out.println("error: "+e.getMessage()+"not found");
                System.out.println("error: can't be logged");

            }
            
        }

        
    }

    public static void main(String[] args)  {
        //throws ClassNotFoundException
        // System.out.println("Hello there!");

       // Main main = new Main();//if Sub is not static class
       // Main.Sub console= main.new Sub();

       Main.Sub console = new Main.Sub();// here sub is static inner class

          //console.log();


        Human kajan=new Human("kajan", 1000.00,"Zangetsu");
        Human ichigo=new Human("ichigo", 1000.00,"Zanku");
       // System.out.println(kajan);

       console.log(kajan);

       kajan.buyDog("shiny");
        
        // System.out.println(kajan.myDog);
        Dog.aging();
        // System.out.println(kajan.myDog.foodCapacity);

        // kajan.checkBalance();

        // kajan.myDog.bark();
        //  kajan.myDog.sound("woof woof woof..");
        //   System.out.println(kajan.myDog.foodCapacity);


      //  kajan.zanpakuto.askName(kajan);

       // System.out.println(kajan.isShikaiUnlocked);

        //console.log(kajan.isShikaiUnlocked);

        kajan.increasePower(10.00,1);

       // System.out.println(kajan.strengthLevel);
      // console.log(kajan.strengthLevel);

         kajan.increaseStrength(kajan);

         // System.out.println(kajan.strengthLevel);
        // console.log(kajan.strengthLevel);

        Hollow hollow1=new Hollow(){

            @Override
            public void increaseSpeed(SoulReaper ob) {
                ob.speedLevel+=5;
            }

            
            @Override
            public void increaseStrength(SoulReaper ob) {
                ob.strengthLevel+=5;
            }

        };

        // when hollow atacking
        console.log(kajan.healthLevel);
        hollow1.attack(kajan);
        console.log(kajan.healthLevel);

        // // when soulreaper attack
        // console.log(hollow1.healthLevel);
        // kajan.attack(hollow1);
        // console.log(hollow1.healthLevel);
          


         // System.out.println(SoulReaperType.age);


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
