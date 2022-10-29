import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Supermarket magnit = new Supermarket();
        LinkedList customersList = new LinkedList<>();
        customersList.add("Tolya");
        customersList.add("Olya");
        customersList.add("Petya");
        customersList.add("Oleg");
        customersList.add("Masha");
        customersList.add("Marina");
        Random r = new Random();
        int x = r.nextInt(5) ;
        for (int i = 0; i < x; i++){
            x = r.nextInt(5) ;
            magnit.addToQueueKassa1(customersList.get(x).toString());
        }
        for (int i = 0; i < x; i++){
            x = r.nextInt(5) ;
            magnit.addToQueueKassa2(customersList.get(x).toString());
        }
        System.out.println(magnit.getQueueKassa1());
        System.out.println("  ");
        System.out.println(magnit.getQueueKassa2());

        magnit.addToLowerQueue(customersList.get(0).toString());
        magnit.removeFromQueue();
        System.out.println(magnit.getQueueKassa1());
        System.out.println("  ");
        System.out.println(magnit.getQueueKassa2());

    }
}