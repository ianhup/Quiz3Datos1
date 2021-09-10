package com.ihupp;

public class DLLNode { //Sets the defined values of each variable
    private Integer value;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(Integer value, DLLNode prev, DLLNode next){ //Sets the defined values of each variable
        this.value = value;
        this.prev = prev;
        this.next=next;
    }

    public Integer getValue() { //Get the predefined value of "value"
        return value;
    }

    public void setValue(Integer value) { //Set the predefined value of "value"
        this.value = value;
    }

    public DLLNode getPrev() {  //Takes the value of the previous node
        return prev;
    }

    public void setPrev(DLLNode prev) { //Set the previous node
        this.prev = prev;
    }

    public DLLNode getNext() { //Takes the value of the next node
        return next;
    }

    public void setNext(DLLNode next) { //Set the next node
        this.next = next;
    }
}
