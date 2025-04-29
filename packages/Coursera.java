package packages;



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
        StringBuilder val= new StringBuilder();
        for(int i=0; i < tos; i++){
           val.append(" ").append(stackImp[i].toString()).append(",");
        }
        return "[ "+val.toString()+" ]";
    }


}

public class Coursera {


    public static void main(String[] args){
        StackImplementation<Integer> intStack =new StackImplementation<>();
        StackImplementation<String> stringStack =new StackImplementation<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        System.out.println("before pop :- "+intStack.show());
        System.out.println(intStack.pop());
        System.out.println("after pop :- "+intStack.show());

        System.out.println("---------------<");

        stringStack.push("hi");
        stringStack.push("bro");
        stringStack.push("bye");

        System.out.println("before pop :- "+stringStack.show());
        System.out.println(stringStack.pop());
        System.out.println("after pop :- "+stringStack.show());
    }
}
