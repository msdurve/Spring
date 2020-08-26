package org.core;

public interface Game {
	public int getNumber() ; 
	public int getGuess() ; 
	public int setGuess(int guess) ; 
	public int getSmallest() ; 
	public int getBiggest() ; 
	public int getRemainingGuesses() ; 
	public void reset() ; 
	public void check() ; 
	public boolean  isValidateNumberRange() ; 
	public boolean isGameWon()  ;
	public boolean isGameLost() ; 

}
