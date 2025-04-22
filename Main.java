import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import packages.Dog;


enum Stages {
    Easy(5),
    Intermediate(10),
    Hard(20),
    Impossible(50);

    int damage;

    private Stages(int damage) {
        this.damage = damage;
    }//wen can also have methods
}

@FunctionalInterface
interface Increase {
    int add(int n1, int n2);
}


public class Main {

    //inner class can use static
    static class Sub {//implementation of javascript console.log()

        public void log(byte data) {
            System.out.println(data);
        }

        public void log(short data) {
            System.out.println(data);
        }

        public void log(int data) {
            System.out.println(data);
        }

        public void log(long data) {
            System.out.println(data);
        }

        public void log(float data) {
            System.out.println(data);
        }

        public void log(double data) {
            System.out.println(data);
        }

        public void log(boolean data) {
            System.out.println(data);
        }

        public void log(char data) {
            System.out.println(data);
        }

        public void log(String data) {
            System.out.println(data);
        }

        public void log(Object data) {
            try {

                data.getClass().getMethod("toString");
                System.out.println(data.toString());

            } catch (NoSuchMethodException | SecurityException e) {
                //System.out.println("error: "+e.getMessage()+"not found");
                System.out.println("error: can't be logged");

            }

        }


    }

    public static void main(String[] args) throws IOException {
        //throws ClassNotFoundException
        // System.out.println("Hello there!");

        // Main main = new Main();//if Sub is not static class
        // Main.Sub console= main.new Sub();

        Main.Sub console = new Main.Sub();// here sub is static inner class

        //console.log();


        System.out.println("Wel Come Player");
        System.out.println("Enter Your name : ");
        String originalValue = "";
        BufferedReader bF = null;
        try {// we can also use try with resources and with that i can automaticaly close resources without explicitly metioning

            // int value = System.in.read();//return asci value
            // System.out.println(value);


            InputStreamReader in = new InputStreamReader(System.in);
            bF = new BufferedReader(in);

            originalValue = bF.readLine();
            int value = Integer.parseInt(originalValue);

            //  Scanner sc = new Scanner(System.in);

            // String value = sc.nextLine();
            System.out.println(value);


        } catch (NumberFormatException e) {// there are multiple execptions like checked and unchecked
            // System.out.println("error :"+e);
            System.out.println(originalValue);

        }
        // catch(IOException  e){
        //      System.out.println("error "+e);
        // }
        catch (IOException e) {
            System.out.println(e);

        } finally {
            if (bF != null) {
                bF.close();
            }
        }

        Human kajan = new Human(originalValue, 1000.00, "Zangetsu");
        Human ichigo = new Human("ichigo", 1000.00, "Zanku");
        System.out.println(kajan);

        System.out.println(Human.some);
        kajan.some = "sja";
        System.out.println(ichigo.some);
        //  console.log(kajan);

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

        kajan.increasePower(10.00, 1);

        // System.out.println(kajan.strengthLevel);
        // console.log(kajan.strengthLevel);

        kajan.increaseStrength(kajan);

        // System.out.println(kajan.strengthLevel);
        // console.log(kajan.strengthLevel);

        Hollow hollow1 = new Hollow() {

            @Override
            public void increaseSpeed(SoulReaper ob) {
                ob.speedLevel += 5;
            }


            @Override
            public void increaseStrength(SoulReaper ob) {
                ob.strengthLevel += 5;
            }

        };


        // when hollow atacking
        // console.log(kajan.healthLevel);
        // hollow1.attack(kajan);
        // console.log(kajan.healthLevel);

        // // when soulreaper attack
        // console.log(hollow1.healthLevel);
        // kajan.attack(hollow1);
        // console.log(hollow1.healthLevel);

        Increase math = (n1, n2) -> n1 + n2 + 1;//functional interface with lambda expression
        //  Increase math = Integer::sum; method reference (in this case I am adding two numbers so it can be done like this with sum)

        //   System.out.println(math.add(5, 10));


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

        //varargs with this we can pass number of arguments like array to method but without creating an array

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


        // Stages currentStage= Stages.Impossible;

        // System.out.println("currentStage : "+currentStage+"index : "+currentStage.ordinal());

        // System.out.println(Stages.values());

        // for(Stages stage: Stages.values()){
        //     System.out.println(stage.damage);
        // }


    }
}
