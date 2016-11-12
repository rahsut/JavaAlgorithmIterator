package com.tvr.iterator;

import java.util.Arrays;
import java.util.Iterator;

import junit.framework.TestCase;

public class PositiveIntegerIteratorTest extends TestCase {

		private Iterator<Integer> iter;
	protected void setUp() throws Exception {
		super.setUp();
		Iterator<Integer> intIter = Arrays.asList(new Integer[] {null, -1, 2, null, 15, -4, 50, null}).iterator();
	    iter = new PositiveIntegerIterator(intIter);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testIter() {
		//multiple hasNext() calls succeed
	    for (int i = 0; i < 100; i++) {
	    	testHasNext(true);
	    }


	    //values are correct
	    testHasNext(true);
	    testNext(Integer.valueOf(2));
	    //no hasNext() call...
	    testNext(Integer.valueOf(15));
	    testHasNext(true);
	    
	    testNext(Integer.valueOf(50));
	    
	    //assert iter.hasNext() == false;
	    testHasNext(false);
	}

	public final void testHasNext(boolean bExpected) {
		assertEquals(" assert hasNext() ",bExpected,iter.hasNext());
	}

	public final void testNext(Integer iNum) {
		assertEquals(" assert iter.next() ",iNum,iter.next());
	}

}
