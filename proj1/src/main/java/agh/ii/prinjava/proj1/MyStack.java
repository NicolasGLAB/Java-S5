package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {
    E pop();       //add an element on the first position of the stack

    void push(E x);         //delete the last element of the stack

    default boolean isEmpty() { return numOfElems() == 0;    //If there are no elements in the stack,
                                                             //it returns true if numofElems() returns 0
    }

    int numOfElems();              //number of elements in the stack

    E peek();                       //returns the start of the stack

    String DisplayStack();         // display the whole stack

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}