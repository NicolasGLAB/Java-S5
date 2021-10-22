package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems=new DLinkList<>();     //elems = stack
    int numbersOfElements=0;                          //count the number of elements in our stack

    //A stack adds elements (push) and deletes (pop) elements at the top position


    @Override
    public String DisplayStack(){
        return elems.toString();        //returns a string of the elements in the linked list
    }

    @Override
    public void push(E x) {
        numbersOfElements=numbersOfElements + 1;
        elems.addLast(x);               //we add the data on the last position of our list elems
    }

    @Override
    public E pop() {
        if(!isEmpty()){         //it is important beforehand to know if the number of elements is strictly greater than 0
                                // because otherwise we cannot remove
            numbersOfElements=numbersOfElements - 1;
        }
        return elems.removeLast();          //we remove the element on the last position of the list
    }


    @Override
    public int numOfElems() {
        return numbersOfElements;       //return the count number of elements in the stack
    }

    @Override
    public E peek() {
        return elems.BytheLast();         //return the data in the last position of the linked list
    }

}
