package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {
    void enqueue(E x);   //add an element on the first position of the queue

    E dequeue();         //delete the last element of the queue

    default boolean isEmpty() { return numOfElems() == 0;     //If there are no elements in the queue,
                                                              //it returns true if numofElems() returns 0
    }

    int numOfElems();         //number of elements in the queue

    E peek();                //returns the start of the queue

    String DisplayQueue();//extra method added to display the whole queue
    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
