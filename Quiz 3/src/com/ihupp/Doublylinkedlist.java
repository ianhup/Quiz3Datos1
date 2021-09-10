package com.ihupp;

public class Doublylinkedlist { //Sets the defined values of each variable

    private DLLNode head;
    private DLLNode tail;
    private int size;

    public Doublylinkedlist(){ //Sets the defined values of each variable
        head = new DLLNode(null,null,null);
        tail = new DLLNode(null ,null,null);
        head.setNext(tail);

    }

    public int getSize(){ //Get the amount of nodes
        return size;
    }

    public boolean isEmpty(){ //If there is no nodes
        return size == 0;
    }

    public Integer first(){ //Set the first node
        if (isEmpty()){
            return null;
        }

        return head.getNext().getValue();

    }

    public Integer last(){ //Set the last node
        if(isEmpty()){
            return null;
        }

        return tail.getPrev().getValue();

    }

    public void addFist(Integer value){ //Add the first node
        addBetween(value,head,head.getNext());
    }

    public void Enqueue(Integer value) { //Add the last node
        addBetween(value, tail.getPrev(), tail);
    }


    private void addBetween(Integer value, DLLNode predecessor, DLLNode successor) { //Set the variable of the nodes that are between the first and the last
        DLLNode newest = new DLLNode(value,predecessor,successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    public Integer Dequeue(){ //Remove the first node
        if (isEmpty()){
            return null;
        }

        return remove(head.getNext());

    }

    public Integer removeLast(){ //Remove the last node
        if (isEmpty()){
            return null;
        }

        return remove(tail.getPrev());

    }

    private Integer remove(DLLNode node){ //Create the variables that make it possible to delete nodes
        DLLNode predecessor = node.getPrev();
        DLLNode successor = node.getNext();

        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;

        return node.getValue();

    }



    public void printList(){ //Print the requested information
        if (isEmpty()){
            System.out.println("list empty");
        } else {
            System.out.print("Queue: ");
            DLLNode start = head.getNext();
            while (start!= tail){
                System.out.print(start.getValue() + " ");

                start = start.getNext();
            }

            System.out.println("\nSize: " + size);
            System.out.println("\nPeak: " + head);

        }
    }

}
