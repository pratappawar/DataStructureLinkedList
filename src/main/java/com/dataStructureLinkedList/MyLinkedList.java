package com.dataStructureLinkedList;

public class MyLinkedList<K> {

    public INode head;
    public INode tail;


    /**
     * constructor declared with head and tail which has initially pointing to null
     */
    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    /**
     * Adding New node to existing node logic
     *  create Linked List by adding 30 and 56 to 70
     *  Node with data 70 is First Created
     *  -Next 30 is added to 70
     * - Finally 56 is added to 30
     * - LinkedList Sequence: 56->30->70
     * @param newNode
     */
    public void add(INode newNode) {

        if (this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    /**
     * Ability to create Linked List by appending 30 and 70 to 56
     * Node with data 56 is First Created
     * - Next Append 30 to 56
     * - Finally Append 70 to 30
     * - LinkedList Sequence: 56->30->70
     * @param newNode
     */
    public void append(INode newNode) {
        if (this.head==null){
            this.head=newNode;
        }
        if (this.tail==null){
            this.tail=newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }

    /**
     * Ability to insert 30 between 56 and 70
     * - Final Sequence: 56->30->70
     * @param myNode
     * @param newNode
     */
    public void insert(INode myNode,INode newNode){
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /**
     * delete the first element in the LinkedList of sequence 56->30->70
     * I have Write pop method to delete element.
     * - Final Sequence: 30->70
     * @return
     * @param
     */
    public INode pop(){
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }

    /**
     *delete the Last element in the LinkedList of sequence 56->30->70
     * I have Write pop method to delete element.
     * Final Sequence: 56->30
     * @return
     */
    public INode popLast(){
        INode tempNode=this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }

    /**
     * search LinkedList to find Node with value 30
     * @param key
     * @return
     */
    public INode searchElement(K key){
        INode tempNode=head;
        while (tempNode!=null){
            if (tempNode.getKey()==key){
                 return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    
    /**
     * Print my node when I appending the node
     * then it will be adding to front node
     */
    public void printMyNode(){
        StringBuffer myNodes=new StringBuffer("My Nodes");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
