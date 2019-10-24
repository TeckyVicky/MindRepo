package com.interview;

import java.util.Iterator;

public class MyClass {

	public static void main(String[] args) {
		
for(String str : new MyCollection()) {
	System.out.println(str);
}
		
	}

}

class MyCollection implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		
		return new MyIterator();
	}
	
}

class MyIterator implements Iterator<String> {

	
 boolean r= true;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		r = false;
		return "Hello";
	}

	public void remove() {
		
	}
	
	
}
