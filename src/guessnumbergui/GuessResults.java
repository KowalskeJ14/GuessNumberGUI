/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumbergui;

/**
 *
 * @author kowal_000
 */
public class GuessResults {
    
    int correctNumber;

    public GuessResults(int randomNum) {
        this.correctNumber = randomNum;
    }
    
    public String checkGuess(String guess) {
        int numberGuessed = Integer.valueOf(guess.trim());
        
        if(numberGuessed > correctNumber) {
            return "Too high, guess again.";
        }
        if(numberGuessed < correctNumber) {
            return "Too low, guess again.";
        }
        else{
            return "You guessed correctly!";
        }
    }
}
