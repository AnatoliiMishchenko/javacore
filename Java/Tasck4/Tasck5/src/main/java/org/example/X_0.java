package org.example;

public class X_0 {
    public static void main(String[] args) {

    }
    public static void print(int[][] grid){
        int humanOne = 1;
        int humanTwo = 2;
        char stepOne = 'X';
        char stepTwo = 'O';

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == humanOne) {
                    grid[row][col] = stepOne;
                    System.out.print(" " + stepOne + " " + "┃");
                } else if (grid[row][col] == humanTwo) {
                    grid[row][col] = stepTwo;
                    System.out.print(" " + stepTwo + " " +"┃");
                } else if (grid[row][col] == 0) {
                    grid[row][col] = ' ';
                    System.out.print(" " + ' ' + " " + "┃");
                }
            }
            System.out.println();
            for (int N = 0; N < grid.length; N++) {
                System.out.print("━" + "━" + "━" + "╋");
            }
            System.out.println();
        }
        System.out.println();
    }
}
