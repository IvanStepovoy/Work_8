import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calculator {



    private long result;

    public long setResult(long c) {
        this.result = c;
        return result;
    }



    public long add(){

        System.out.println("Please enter enter the first number:  ");
        long a = new Scanner(System.in).nextInt();
        System.out.println("Please enter enter the second number:  ");
        long b = new Scanner(System.in).nextInt();
        long c = a + b;

        return setResult(c);
    }

    public long sub(){

        System.out.println("Please enter enter the first number:  ");
        long a = new Scanner(System.in).nextInt();
        System.out.println("Please enter enter the second number:  ");
        long b = new Scanner(System.in).nextInt();
        long c = a - b;

        return setResult(c);
    }

    public long mul(){

        System.out.println("Please enter enter the first number:  ");
        long a = new Scanner(System.in).nextInt();
        System.out.println("Please enter enter the second number:  ");
        long b = new Scanner(System.in).nextInt();
        long c = a * b;

        return setResult(c);
    }

    public long div(){

        System.out.println("Please enter enter the first number:  ");
        long a = new Scanner(System.in).nextInt();
        System.out.println("Please enter enter the second number:  ");
        long b = new Scanner(System.in).nextInt();
        long c = a / b;

        if( b==0 ){

            throw new InvalidParameterException("second number shouldn't be '0'");
        }

        return setResult(c);
    }

    public long getResult() {
        return result;
    }


}

