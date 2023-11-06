package org.lessons.java;

public class Calculator {
    // Attributi
    private float num1;
    private float num2;

    //Getter e Setter

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    //Subtract
    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    //Divide
    public static float divide(float num1, float num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("il dividendo deve essere diverso da zero");
        }
        return num1 / num2;
    }

    //multiply
    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
