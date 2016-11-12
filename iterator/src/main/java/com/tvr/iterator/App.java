package com.tvr.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().testIter();

	}
	
	public void testIter() {
		Iterator<Integer> intIter = Arrays.asList(new Integer[] {null, -1, 2, null, 15, -4, 50, null}).iterator();
	    Iterator<Integer> iter = new PositiveIntegerIterator(intIter);

	  //multiple hasNext() calls succeed
	    for (int i = 0; i < 100; i++) {
	        //assert iter.hasNext();
	        System.out.println("01 assert hasNext() as true = "+iter.hasNext());
	        //assertEquals("assert hasNext() as true",true,iter.hasNext());
	    }


	    //values are correct
	   // assert iter.hasNext();
	    System.out.println("02 assert hasNext() as true = "+iter.hasNext());
	    //assert iter.next() == 2;
	    System.out.println("03 assert iter.next() == 2 as true = "+(iter.next()==2));
	    //no hasNext() call...
	    //assert iter.next() == 15;
	    System.out.println("04 assert iter.next() == 15 as true = "+(iter.next() == 15));
	    
	    //assert iter.hasNext();
	    System.out.println("05 assert hasNext() as true = "+iter.hasNext());
	    
	    //assert iter.next() == 50;
	    System.out.println("06 assert iter.next() == 50 as true = "+(iter.next() == 50));
	    
	    //assert iter.hasNext() == false;
	    System.out.println("07 assert hasNext() as false = "+iter.hasNext());
	    
	}

}
