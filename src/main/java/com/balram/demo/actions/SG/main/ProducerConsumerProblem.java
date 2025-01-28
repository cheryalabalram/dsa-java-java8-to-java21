package com.balram.demo.actions.SG.main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Problems to Solve:
//Buffer Overflow: When the producer tries to add data to a full buffer.
//Buffer Underflow: When the consumer tries to remove data from an empty buffer.
//Synchronization: Ensuring that producers and consumers do not access the buffer simultaneously in a way that causes inconsistency.

public class ProducerConsumerProblem {
    //BlockingQueue: Manages synchronization internally.
    //Methods like put() and take() handle waiting when the buffer is full or empty.
    //Producer: Adds items to the queue. If the queue is full, put() blocks until space becomes available.
    //Consumer: Removes items from the queue. If the queue is empty, take() blocks until an item is available.

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    queue.put("Str - "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable consumer = () -> {
            while(true){
                try{
                    String item = queue.take(); // Removes an item from the queue, waits if empty
                    System.out.println("Consumed: " + item + " - Thread - "+Thread.currentThread().getName());
                }catch (Exception e){
                    System.err.println(e.getCause());
                }
            }
        };

       Thread t = new Thread(producer,"Producer");
       Thread v = new Thread(consumer, "Consumer");

       t.start();
       v.start();

//        Thread.ofVirtual().start(producer);
//        Thread.ofVirtual().start(consumer);


        // Ensure the main thread waits for virtual threads to complete
//        try {
//            Thread.sleep(2000); // Adjust as needed
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
    }
}
