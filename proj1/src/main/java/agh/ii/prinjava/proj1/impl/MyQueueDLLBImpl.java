package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems=new DLinkList<>();   //elems = queue
    int  numbersOfElements=0;                       //count the number of elements in our queue

    @Override
    public String DisplayQueue() {
        return null;                 //display the queue
    }

    @Override
    public void enqueue(E x) {
        elems.addFirst(x);          //we add the data on the first position of our list elems
        numbersOfElements=numbersOfElements+1;       //we add 1 to nb_elems
    }

    @Override
    public E dequeue() {
        if(!isEmpty()){   //it is important beforehand to know if the number of elements is strictly greater than 0
                          // because otherwise we cannot remove
            numbersOfElements=numbersOfElements-1;
        }
        return elems.removeFirst();     //we remove the element on the first position of the list
                                        // first position = last number on the queue
    }


    @Override
    public int numOfElems() {
        return numbersOfElements;      //return the variable that we used to count the number of elements in the queue
    }


    @Override
    public E peek() {
        return elems.BytheTop();        //return in the linked list the data in the first position list
    }



}