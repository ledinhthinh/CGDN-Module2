package case_study.models;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Cinema4D {
    public static void main(String[] args) {
        Customers customers1 = new Customers("Trần A","1/11/2011","Male","111111111","03333333333","abc@abc.com","Gold","Quang Nam");
        Customers customers2 = new Customers("Trần B","1/11/2021","Male","222222222","03333333333","abc@abc.com","Gold","Quang Ngai");
        Queue<Customers> customersQueue = new ArrayDeque<>();
        customersQueue.offer(customers1);
        customersQueue.offer(customers2);
        for (Customers c:customersQueue) {
            System.out.println(customersQueue.poll());
        }

    }
}
