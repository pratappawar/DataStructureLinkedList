package com.dataStructureLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    /**
     * Ability to create simple Linked list and add element into it
     * and print the elements
     */
    @Test
    public void given3NumbersWhenAddedToLinkedList_ShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myThirdNode)&&
                       myLinkedList.head.getNext().equals(mySecondNode)&&
                       myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    /**
     * Ability to add the node at last
     */
    @Test
   public void given3NumbersWhenAppendedToLinkedList_ShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    /**
     * Ability to Insert a Node in Between the Nodes
     */
    @Test
   public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    /**
     * Ability to delete First Element
     */
    @Test
   public void given1stElementWhenDeleteShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(mySecondNode)&&
                        myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    /**
     * Ability to Delete last Element in LinkedList
     */
    @Test
   public void givenLastElementWhenDeleteShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        INode deleteNode=myLinkedList.popLast();
        Assertions.assertEquals(deleteNode,mySecondNode);
    }

    /**
     * Ability to search Element
     */
    @Test
   public void givenElementWhenFoundShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        INode search=myLinkedList.searchElement(30);
        Assertions.assertEquals(search,mySecondNode);
    }

    /**
     * Ability to search Element and insert the new Element After Search Element
     */
    @Test
   public void SearchDataNodeForGivenDataIfFoundShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        INode search=myLinkedList.searchElement(30);
        myLinkedList.insert(search,myFourthNode);
        myLinkedList.printMyNode();
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(search)
                && myLinkedList.head.getNext().getNext().equals(myFourthNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assertions.assertTrue(result);
    }

    /**
     * Ability to delete 40 from the Linked
     * List sequence of 56->30->40->70
     * and show the size of LinkedList is 3
     */
    @Test
    public void SearchNodeForGivenElementIfFoundShouldDeleteGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.printMyNode();
        myLinkedList.popElement(40);
        myLinkedList.printMyNode();
        int size=myLinkedList.getSize();
        Assertions.assertEquals(3,size);
    }
}
