package edu.ben.lab_2;

public class StringNode {

    private String value;
    private StringNode next;

    public StringNode(String value) {
    }




    public  String getValue(){

        return this.value;
    }
    public StringNode getNext(){

        return this.next;
    }
    public boolean hasNext(){

        return this.next != null;
    }
    public void setNext(StringNode next){

        this.next = next;
    }

}
