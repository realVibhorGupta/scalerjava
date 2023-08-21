/*
 * Copyright (c) 2023. , Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   License: MIT
 * The MIT License (MIT).
 * Copyright © 2023, Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy   of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: .The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  .
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import java.util.Scanner;

public class TikTacToe {
    public static void main(String[] args) {

        System.out.println("Tik Tak Toe Game!!");

        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean isGameOver = false;
        Scanner input = new Scanner(System.in);

        while (!isGameOver) {
            printBoard(board);
            System.out.println("Player" + player + "Enter:");
            int row = input.nextInt();
            int column = input.nextInt();
            if (board[row][column] == ' ') {
                // place the element

                board[row][column] = player;
                isGameOver = haveWon(board, player);
                if (isGameOver) {
                    System.out.println("Player" + player + " has won!!!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';

                }
            } else if (input.nextInt() >= board.length) {
                System.out.println("Invalid Input Try Again!");
            } else {
                System.out.println("Invalid Move! Try Again...");
            }

        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        //check the rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        //chec for column
        for (int column = 0; column < board.length; column++) {
            if (board[0][column] == player && board[1][column] == player && board[2][column] == player) {
                return true;
            }
        }

        //checl for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }
}
