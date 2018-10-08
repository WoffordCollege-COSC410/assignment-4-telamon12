package edu.wofford;
//Marc- runs the gameBoard from TicTacToeModel in the console

import java.util.Scanner;

public class ConsoleMain {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TicTacToeModel gameBoard = new TicTacToeModel();
        String[] userInput = new String[2];
        while (gameBoard.getResult() == TicTacToeModel.Result.NONE) {
            System.out.print(gameBoard.toString());
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();
            gameBoard.setMarkAt(row, col);
            System.out.print(gameBoard.toString());
        }
        if(gameBoard.getResult() == TicTacToeModel.Result.XWIN){
            System.out.println("X wins");
        }
        if(gameBoard.getResult() == TicTacToeModel.Result.OWIN){
            System.out.println("O wins");
        }
        if(gameBoard.getResult() == TicTacToeModel.Result.TIE){
            System.out.println("Tie");
        }

// IT LIVES! I think? robot tests are not cooperating with intelliJ, will have to fix this another time

        // Marc: see class notes. use that stuff here


/**
 * So, what needs to happen here? I need to ask Dr Garrett for some clarifications. So, what exactly does ConsoleMain do?
 * What does GuiMain do? What about Main.java? TicTacToeModel does something, and is the only one directly tested,
 * but what is it's purpose? I am confused. This may be because I'm used to detailed to_do statements in my assignments,
 * but it's also not terribly clear what he wants out of each.
 **/
//See class notes, i have somewhat of an answer here
    }
}