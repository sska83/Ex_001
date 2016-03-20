package com.aboz.trena.ex;

public class Main {

    public static void main(String[] args) {
                // переменные
                int a = 10; //
                int b = 1; //

                // обработка исключений
                try {
                    int c = a / b; //на 0 не делится
                    System.out.println(c);
                }
                catch (ArithmeticException ex){
                    System.out.println("не делится на ноль");
                }

                // за пределами try
                //int c = a / b;
                //System.out.println(c);

    }
}
