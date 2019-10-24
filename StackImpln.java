package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class StackImpln {
	private int arr[];
	private int cap;
	private int top;
	
	
	public StackImpln(int size) {
		arr = new int[size];
		cap = size;
		top = -1;
	}
	public int size() {
		return top + 1;
	}
	public boolean isFull() {
		//System.out.println(top == cap - 1);
		return top == cap - 1;
		
	}
	public boolean isEmpty() {
		return top == -1;
		
	}
	public void push(int e) {
		
		if(isFull()) {
			System.out.println("Stack is Full");
			System.exit(1);
		}
			System.out.println("Insert : " + e);
			arr[++top] = e;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		System.out.println("Removing : " + peek());
		return arr[top--];
		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		else {
			return arr[top];
		}
		return -1;
		
	}

	public int search(int el) {
		int top = 1;
		while (top<=cap-1) {
			System.out.println(top);
			System.out.println("gsdg" + arr[top]);
			if (arr[top] == el) {
				return top;
				
			}
			
			
			
		}
		return -1;
	}
	
	public static void main(String[] args) { 
		StackImpln st = new StackImpln(3);
		st.push(1);
		st.push(2);
		st.push(3);
		//st.push(4);
		//st.pop();
		//st.pop();
		//st.pop();
		
		System.out.println(st.peek());
		//System.out.println(list);
		System.out.println(st.search(1));
	}

}
