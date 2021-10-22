package agh.ii.prinjava.proj1.impl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        System.out.println(dLinkList.toString());  //display 3,2,1

    }

    @Test
    void addLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        System.out.println(dLinkList.toString());  //display 1,2,3
    }

    @Test
    void removeFirst() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        System.out.println(dLinkList.toString());  //display 1,2,3

        dLinkList.removeFirst();
        System.out.println(dLinkList.toString()); //display 2,3

        dLinkList.removeFirst();
        System.out.println(dLinkList.toString()); //display 3

        dLinkList.removeFirst();
        System.out.println(dLinkList.toString()); //display null

        dLinkList.removeFirst();
        System.out.println(dLinkList.toString()); //display null
        //etc
    }

    @Test
    void removeLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        System.out.println(dLinkList.toString());  //display 1,2,3

        dLinkList.removeLast();
        System.out.println(dLinkList.toString());  //display 1,2

        dLinkList.removeLast();
        System.out.println(dLinkList.toString());  //display 1

        dLinkList.removeLast();
        System.out.println(dLinkList.toString());  //display null

        dLinkList.removeLast();
        System.out.println(dLinkList.toString());  //display null
        //etc
    }

    @Test
    void ToString() {
        System.out.println(dLinkList.toString()); //display 'null' as the list is empty

        dLinkList.addLast(1);
        System.out.println(dLinkList.toString()); //display '1->null'

        dLinkList.addLast(2);
        System.out.println(dLinkList.toString()); //display '1->2->null'

        dLinkList.addLast(3);
        System.out.println(dLinkList.toString()); //display '1->2->3->null'
        //etc
    }

}