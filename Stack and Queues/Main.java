import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Stack c = new Stack();
        Queue q = new Queue();

        ArrayList<String> b = c.push("Lwando");
        System.out.println(b);
        ArrayList<String> a = c.push("Ayanda");
        System.out.println(a);
        ArrayList<String> d = c.push("Luvo");
        System.out.println(d);
        ArrayList<String> e = c.push("Mvuselelo");
        System.out.println(e);
        ArrayList<String> f = c.pop();
        System.out.println(f);

        System.out.println("Testing the queue now");

        ArrayList<String> g = q.enqueue("Lwando");
        System.out.println(g);
        ArrayList<String> h = q.enqueue("Ayanda");
        System.out.println(h);
        ArrayList<String> i = q.enqueue("Luvo");
        System.out.println(i);
        ArrayList<String> j = q.enqueue("Mvuselelo");
        System.out.println(j);
        ArrayList<String> k = q.dequeue();
        System.out.println(k);


    }
}