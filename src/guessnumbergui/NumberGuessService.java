/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumbergui;

import Windows.GuessWindow;
import java.util.Random;

/**
 *
 * @author kowal_000
 */
public class NumberGuessService {
    private String guess;
    private int correctNumber;
    private int lowNum;
    private int highNum;
    int randomNum;
    GuessResults gameResults;
    
    public void StartGame() {
//        randomNum = (int)Math.floor((Math.random() * 50) + 1);
//        Random random = new Random();
//        randomNum = random.nextInt((highNum - lowNum) + 1) + lowNum;
//        gameResults = new GuessResults(randomNum);
    }
    
    public void setNumberRange(String lowNum, String highNum) {
        this.lowNum = Integer.valueOf(lowNum.trim());
        this.highNum = Integer.valueOf(highNum.trim());
    }
    
    public String checkGuess(String guess) {
        return gameResults.checkGuess(guess);
    }
    
    public void setRandomNum() {
        Random random = new Random();
        randomNum = random.nextInt((highNum - lowNum) + 1) + lowNum;
        gameResults = new GuessResults(randomNum);
    }
}
