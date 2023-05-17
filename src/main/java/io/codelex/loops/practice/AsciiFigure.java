package io.codelex.loops.practice;

public class AsciiFigure {
    private static final int SIZE = 5;

    public static void main(String[] args) {
        drawFigure(SIZE);
    }

    public static void drawFigure(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i - 1) * 2; j++) {
                System.out.print("//");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (size - i - 1) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
