import java.util.ArrayList;

public class Queue{
    private ArrayList<String> queueList;

    public Queue(){
        this.queueList = new ArrayList<String>();
    }

    public ArrayList<String> enqueue(String name){
        if (name != null){ // } && queueList.size() == 0){
            queueList.add(name);
        }
        return queueList;
    }

    public ArrayList<String> dequeue(){
        queueList.remove(0);
        return queueList;
    }
}