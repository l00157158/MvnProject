package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Hello Jimmy");
        Calculator calculator = new Calculator();
        int sum = calculator.add(40, 50);
        int diff = calculator.substract(50, 40);

        System.out.println("sum: " + sum);
        System.out.print("diff: " + diff);
    }
}
