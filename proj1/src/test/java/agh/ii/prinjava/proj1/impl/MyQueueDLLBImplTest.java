package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void displayQueue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);   //Queue contains; 1,2 and 3
        System.out.println(queueOfInts.DisplayQueue());  //display null->1->2->3->null

    }


    @Test
    void enqueue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);  //Queue contains; 1,2 and 3
        System.out.println(queueOfInts.DisplayQueue());         //display 1,2,3
    }

    @Test
    void dequeue() {
        // need to have a full queue e.g. 1 to 3
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);   //Queue contains 1,2,3
        System.out.println(queueOfInts.DisplayQueue());  //display 1,2,3


        queueOfInts.dequeue();    //Queue contains 1,2
        System.out.println(queueOfInts.DisplayQueue());   //display 1,2

        queueOfInts.dequeue();    //Queue contains 1
        System.out.println(queueOfInts.DisplayQueue());   //display 1

        queueOfInts.dequeue();    //Queue contains empty
        System.out.println(queueOfInts.DisplayQueue());   //display null

        queueOfInts.dequeue();    // display null again
        System.out.println(queueOfInts.DisplayQueue());    //display null
        //etc
    }

    @Test
    void numOfElems() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);     //Queue contains 1,2,3
        System.out.println(queueOfInts.numOfElems()); //display 3 because we have 3 datas


        queueOfInts.dequeue();   //Queue contains 1,2
        System.out.println(queueOfInts.numOfElems());   //display 2 because we have 2 datas

        queueOfInts.dequeue();   //Queue contains 1
        System.out.println(queueOfInts.numOfElems());   //display 1 because we have 1 data

        queueOfInts.dequeue();   //Queue contains null
        System.out.println(queueOfInts.numOfElems());   //display 0 because we have 0 data


        queueOfInts.dequeue();   //Queue contains null
        System.out.println(queueOfInts.numOfElems());    //display 0 because we have 0 data
        //etc
    }

    @Test
    void peek() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);   //Queue contains 1,2,3
        System.out.println(queueOfInts.peek());   //display the top of the queue:(3)
    }


}