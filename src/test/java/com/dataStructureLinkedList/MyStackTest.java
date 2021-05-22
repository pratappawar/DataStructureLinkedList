package com.dataStructureLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {

    /**
     * Test case to check 3 numbers added or not to stack
     */
    @Test
    public void given3_No_When_AddedToStack_Should_Have_LastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak=myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
}
