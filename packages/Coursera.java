package packages;


import java.util.*;

interface Stack<T>{
    void push(T val);
    T pop();
    String show();
}

class StackImplementation<T> implements Stack<T> {
    private final T[] stackImp;
    private int tos;

    public StackImplementation(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    public StackImplementation(int length) {
        tos=0;
        stackImp = (T[]) new Object[length];
    }

    @Override
    public void push(T val) {
        stackImp[tos++]=val;
    }

    @Override
    public T pop() {
        return tos>0 ? stackImp[--tos] : null;
    }

    @Override
    public String show() {
        System.out.println("ds");
        StringBuilder val= new StringBuilder();
        for(int i=0; i < tos; i++){
           val.append(" ").append(stackImp[i].toString()).append(",");
        }
        return "[ "+val.toString()+" ]";
    }


}

class NotSureList{
    List<?> storage =new ArrayList<>();


    <T> void arrayToCollection(T[] a, Collection<T> c){
        for(T o : a){
            c.add(o);
        }
    }
}

class Sure<T> extends StackImplementation<T>{

}

class Person implements Comparable{
    int n;

    public Person(int val){
        n=val;
    }

    @Override
    public int compareTo(Object o2) {
        return this.n %10> ((Person)o2).n %10? 1 : this.n%10==((Person)o2).n%10 ? 0 :-1;
    }
}

public class Coursera {


    public static void main(String[] args){
        StackImplementation<Integer> intStack =new StackImplementation<>();
        StackImplementation<String> stringStack =new StackImplementation<>();

//        Sure<Integer> againNotSure=new Sure<>();
//
//        againNotSure.push(4);
//        againNotSure.push("da");
//
//        System.out.println(againNotSure.show());



//        intStack.push(1);
//        intStack.push(2);
//        intStack.push(3);
//        intStack.push(4);
//
//        System.out.println("before pop :- "+intStack.show());
//        System.out.println(intStack.pop());
//        System.out.println("after pop :- "+intStack.show());
//
//        System.out.println("---------------<");
//
//        stringStack.push("hi");
//        stringStack.push("bro");
//        stringStack.push("bye");
//
//        System.out.println("before pop :- "+stringStack.show());
//        System.out.println(stringStack.pop());
//        System.out.println("after pop :- "+stringStack.show());


//        List<Integer> myList=new ArrayList<>();
//        myList.add(53);
//        myList.add(24);
//        myList.add(24);
//        myList.add(41);
//
//        Comparator<Integer> myComparator=(Integer o1, Integer o2)-> o1%10>o2%10? 1 : o1%10==o2%10 ? 0 :-1;
//
//
//
//        Collections.sort(myList,myComparator);
//
//        myList.forEach(li-> System.out.println(li));



//        Iterator<Integer> myListIterator=myList.iterator();
//
//        while (myListIterator.hasNext()){
//
//        System.out.println(myListIterator.next());
//
//        }


//        HashSet<String> myList2=new HashSet<>();
//        myList2.add("c++");
//        myList2.add("docker");
//        myList2.add("app");
//
//        Iterator<String> myListIterator2=myList2.iterator();
//
//        while (myListIterator2.hasNext()){
//
//        System.out.println(myListIterator2.next());
//
//        }

        List<Person> perArr=new ArrayList<>();
        perArr.add(new Person(53));
        perArr.add(new Person(21));
        perArr.add(new Person(24));
        perArr.add(new Person(41));

        Collections.sort(perArr);

        perArr.forEach((per)-> System.out.println(per.n));


    }
}
