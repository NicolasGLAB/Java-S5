package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void displayStack() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);   //Stack contains; 1,2 and 3
        System.out.println(stackOfInts.DisplayStack());   //display null->1->2->3->null
    }

    @Test
    void push() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);   //Stack contains; 1,2 and 3
        System.out.println(stackOfInts.DisplayStack());    //display 1,2,3
    }

    @Test
    void dequeue() {
        // need to have a full queue e.g. 1 to 3
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);   //Stack contains 1,2,3
        System.out.println(stackOfInts.DisplayStack());  //display 1,2,3


        stackOfInts.pop();    //Stack contains 1,2
        System.out.println(stackOfInts.DisplayStack());   //display 1,2

        stackOfInts.pop();    //Stack contains 1
        System.out.println(stackOfInts.DisplayStack());   //display 1

        stackOfInts.pop();    //Stack contains empty
        System.out.println(stackOfInts.DisplayStack());   //display null

        stackOfInts.pop();    // display null again
        System.out.println(stackOfInts.DisplayStack());    //display null
        //etc
    }


        @Test
        void numOfElems () {
            stackOfInts.push(1);
            stackOfInts.push(2);
            stackOfInts.push(3);     //Stack contains 1,2,3
            System.out.println(stackOfInts.numOfElems()); //display 3 because we have 3 datas


            stackOfInts.pop();   //Stack contains 1,2
            System.out.println(stackOfInts.numOfElems());   //display 2 because we have 2 datas

            stackOfInts.pop();   //Stack contains 1
            System.out.println(stackOfInts.numOfElems());   //display 1 because we have 1 data

            stackOfInts.pop();   //Stack contains null
            System.out.println(stackOfInts.numOfElems());   //display 0 because we have 0 data


            stackOfInts.pop();   //Stack contains null
            System.out.println(stackOfInts.numOfElems());    //display 0 because we have 0 data
            //etc
        }

        @Test
        void peek () {
            stackOfInts.push(1);
            stackOfInts.push(2);
            stackOfInts.push(3);   //Stack contains; 1,2 and 3
            System.out.println(stackOfInts.peek());   //display the top of the stack:(3)
        }

    }