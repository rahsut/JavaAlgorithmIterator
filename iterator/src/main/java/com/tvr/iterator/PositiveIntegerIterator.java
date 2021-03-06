package com.tvr.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PositiveIntegerIterator implements Iterator<Integer> {
	
	 private List<Integer> intArrayList;
	 private int currentSize;
	
	
        private PositiveIntegerIterator();
	
	public PositiveIntegerIterator(Iterator<Integer> i) {
	        intArrayList=new ArrayList<Integer>();
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
            throw new NoSuchElementException(" NoSuchElementException for size = " + intArrayList.size());
        }
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
