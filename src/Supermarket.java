import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Supermarket {
    private Queue<String> queueKassa1 = new ArrayDeque<>(5);

    private Queue<String> queueKassa2 = new ArrayDeque<>(5);

    public Queue<String> getQueueKassa1() {
        return queueKassa1;
    }

    public Queue<String> getQueueKassa2() {
        return queueKassa2;
    }

    public void addToQueueKassa1(String customer) {
        queueKassa1.offer(customer);
    }

    public void addToQueueKassa2(String customer) {
        queueKassa2.offer(customer);
    }

    public void addToLowerQueue(String customer){
        if ((queueKassa1.size()==queueKassa2.size() && queueKassa1.size() < 5) ||
                (queueKassa1.size() < queueKassa2.size() && queueKassa1.size() < 5)){
            System.out.println("В первую");
            addToQueueKassa1(customer);
        } else if (queueKassa1.size() > queueKassa2.size() && queueKassa2.size() < 5) {
            System.out.println("Во вторую");
            addToQueueKassa2(customer);
        } else {
            System.out.println("Позвать Галю");
        }
    }

    public void removeFromQueue(){
        Random r = new Random();
        int x = r.nextInt(2) ;
        if (x == 0){
            queueKassa1.remove();
        } else {
            queueKassa2.remove();
        }
    }
}
