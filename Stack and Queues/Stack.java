import java.util.ArrayList;

public class Stack{
    private ArrayList<String> stackList;
    public Stack(){
        this.stackList = new ArrayList<String>();
    }

    public ArrayList<String> push(String name){
        if (name !=null){
            stackList.add(0, name);
        }
        return stackList;
    }

    public ArrayList<String> pop(){
        //stackList.remove(stackList.size() - 1);
        stackList.remove(0);
        return stackList;
    }
}