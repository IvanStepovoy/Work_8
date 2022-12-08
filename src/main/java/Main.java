import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Please enter a number of arithmetic operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int inpOper = new Scanner(System.in).nextInt();

        Calculator calculator = new Calculator();



        switch (inpOper) {


            case 1: calculator.add();
                break;
            case 2: calculator.sub();
                break;
            case 3: calculator.mul();
                break;
            case 4: calculator.div();
                break;


        }

        System.out.println(calculator.getResult());



    }
}