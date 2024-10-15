package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(5);
    }

    public static void whileLoop(int num) {
        int X = 0;

        while (X < num) {
            System.out.println(X + " < " + num + ". El proximo ciclo valdra: " + (X + 1));

            X++;
        }
    }
}