package com.tvr.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PositiveIntegerIterator implements Iterator<Integer> {
	
	 private List<Integer> intArrayList =new ArrayList<Integer>();
	 private int currentSize;
	    
	public PositiveIntegerIterator(Iterator<Integer> i) {
		while(i.hasNext()){
			Integer iInt = i.next();
			if(!(iInt==null||iInt<0)){
				intArrayList.add(iInt);
			}
		}
		currentSize = 0;
	}
	
	@Override
	public boolean hasNext() {
		return !(intArrayList.size() == currentSize);
	}
	
	@Override
	public Integer next() {
		if(hasNext()) {
            return intArrayList.get(currentSize++);
        } else {
            throw new NoSuchElementException("There are no elements size = " + intArrayList.size());
        }
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
