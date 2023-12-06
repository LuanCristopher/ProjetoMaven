package meuapp;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("3 + 4 = " + calculator.add(3, 4));
        System.out.println("7 - 4 = " + calculator.subtract(7, 4));
    }
}
