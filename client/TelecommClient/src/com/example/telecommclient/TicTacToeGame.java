package com.example.telecommclient;

public class TicTacToeGame {
	
	private char[][] TicTacToeBoard = new char[3][3];
	private boolean myTurn = false;
	
	
	private void resetCharArray(char[] Array) {
		for (int i = 0; i < Array.length; i++) {
			Array[i] = '-';
		}
	}
	
	private void resetCharArray(char[][] Array) {
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; i++) {
				Array[i][j] = '-';
			}
		}
	}
	
    public void init(){
    	resetCharArray(TicTacToeBoard);
    }
    
    public void testWin(){
    	char[] testH = new char[3];
    	resetCharArray(testH);
    	for(int i = 0; i< TicTacToeBoard.length; i++){
    		for (int j = 0; j < TicTacToeBoard[i].length; i++){
    			TicTacToeBoard[i][j] = '-';
    		}
    	}
    }
	

}
