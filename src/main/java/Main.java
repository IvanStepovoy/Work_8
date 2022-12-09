import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Please enter a number of arithmetic operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print(": ");


        int inpOper = new Scanner(System.in).nextInt();

        Calculator calculator = new Calculator();



        switch (inpOper) {


            case 1: calculator.add(3,5);
                break;
            case 2: calculator.sub(5,4);
                break;
            case 3: calculator.mul(7,4);
                break;
            case 4: calculator.div(8,2);
                break;


        }

        System.out.println(calculator.getResult());


        System.out.println();
        System.out.println("Please enter a number of arithmetic operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print(": ");


        int inpOper2 = new Scanner(System.in).nextInt();

        Calculator calculator1 = new Calculator();



        switch (inpOper) {


            case 1: calculator.add(3);
                break;
            case 2: calculator.sub(5);
                break;
            case 3: calculator.mul(4);
                break;
            case 4: calculator.div(2);
                break;


        }



    }
}