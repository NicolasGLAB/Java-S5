package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    Node<E> head = null;


    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

    }

    public void addFirst(E new_element){    //add an element on the first position of the list
        Node<E> save = head;              //create and save the reference
        Node<E> node = new Node<>();      //initialize the new node and save

        node.elem = new_element;
        node.next = save;
        node.prev=null;

        head = node;        //head becomes the new node
    }

    public void addLast(E new_element){         //add an element on the last position of the list
        Node<E> save = head;                 //create and save the reference
        Node<E> node = new Node<>();         //initialize the new node and save

        node.elem=new_element;

        if(head==null) { // we use the addFirst method
            head = node;
        }
        else{        //head>0, we look for the last element
            while (save.next != null) {
                save = save.next;
            }
            save.next=node;
        }


        node.next=null;
        node.prev = save;

    }


    public E removeFirst(){          //remove an element on the first position of the list
        Node<E> save = head;                 //create and save the reference
        E value = null;              //initialize the value of the element

        if(head!=null){      //save the value of the element to be removed in value
            value=head.elem;
            save=save.next;

            if(save!=null) {
                //if the save is not zero then put its ref of prev to null as it will become the first node of the list
                save.prev = null;
            }
            head=save;
        }
        return value;
    }


    public E removeLast(){       //remove an element on the last position of the list
        Node<E> save = head;                 //create and save the reference
        E value = null;              //initialize the value of the element
        Node<E> prev = save;

        if(head!=null){
            value = save.elem;      //save the value to delete

            if(save.next == null){     //only one element in the list
                head=null;
            }

            else{           //search until tje last element
                while(save.next != null){
                    prev = save;
                    save = save.next;
                }
                prev.next=null;        //remove the last element
            }
        }

        return value;     //return the value of the removed element
    }


    public String toString() {       //return a string containing all the elements
        String list;

        if(head ==null) { //empty
            list="null";
        }

        else{
            Node <E> save = head;     //create and save the reference
            list = "";      //list is an empty at the beginning
            String s1;        //convert value in string of the data element

            while (save.next != null) {
                s1 = String.valueOf(save.elem);     //convert the element to a string in s1
                list = list + s1 + "->";        //add to the string list with s1
                save = save.next;    //continue to save
            }
            s1 = String.valueOf(save.elem);          //add the last element in the string list
            list = list + s1 + "->null";
        }

        return list;      //return string
    }

    public E BytheTop() {
        return null;
    }

    public E BytheLast() {
        return null;
    }
}

