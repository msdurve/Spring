package org.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameImpl implements Game {
	
	@Autowired
	private NumberGenerator numberGenerator ; 
	
	private int guessCount  ; 
	private int number ; 
	private int smallest ;
	private int biggest ;
	private int remainingGuesses = 10 ; 
	private int guess; 
	
	public static Logger log = LoggerFactory.getLogger(GameImpl.class) ; 
	
	/*
	 * public GameImpl(NumberGenerator numberGenerator) { this.numberGenerator =
	 * numberGenerator; }
	 */

	

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGuess() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setGuess(int guess) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSmallest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBiggest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRemainingGuesses() {
		// TODO Auto-generated method stub
		return 0;
	}

	@PostConstruct
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		log.info("----Bean Reset Method called");
		smallest = 0 ; 
		guess = 0 ; 
		remainingGuesses = guessCount ; 
		biggest = numberGenerator.getMax() ; 
		number = numberGenerator.getNext() ; 
		
		log.info("this number is {} " , number ) ;
	}
	

	@PreDestroy   
	public void preDestroyMethod() {
		log.debug("Pre destroy method called") ; 
	}
	
	
	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValidateNumberRange() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGameWon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGameLost() {
		// TODO Auto-generated method stub
		return false;
	}

}
