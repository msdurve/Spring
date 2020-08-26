package org.core;

import java.util.Random;

import org.springframework.stereotype.Component;

 @Component
public class NumberGeneratorImpl implements NumberGenerator {
	
	private Random random = new Random() ;
	private int maxNumber = 100 ; 
	
	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		return  random.nextInt(maxNumber) ; 
	}

	@Override
	public int getMax() {
		// TODO Auto-generated method stub
		return maxNumber;
	}

}
